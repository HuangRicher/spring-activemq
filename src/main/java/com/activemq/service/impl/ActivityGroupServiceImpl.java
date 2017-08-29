package com.activemq.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activemq.amq.MessageSenderThree;
import com.activemq.amq.MessageSenderTwo;
import com.activemq.dao.ActivityGroupDao;
import com.activemq.dao.ActivityGroupItemDao;
import com.activemq.dao.CouponsDao;
import com.activemq.dao.MemberCouponDao;
import com.activemq.entity.ActivityGroup;
import com.activemq.entity.ActivityGroupItem;
import com.activemq.entity.MemberCoupon;
import com.activemq.entity.po.ActivityGroupPO;
import com.activemq.entity.po.CouponsWithBLOBsPO;
import com.activemq.service.ActivityGroupService;
import com.activemq.utils.StringUtil;
import com.enation.framework.jms.JmsMessage;
@Service
public class ActivityGroupServiceImpl implements ActivityGroupService {

	@Autowired
	private ActivityGroupDao activityGroupDao;
	
	@Autowired
	private MessageSenderTwo messageSenderTwo;
	
	@Autowired
	private MessageSenderThree messageSenderThree;
	
	@Autowired
	private ActivityGroupItemDao activityGroupItemDao;
	
	@Autowired
	private MemberCouponDao memberCouponDao;
	
	@Autowired
	private CouponsDao couponsDao;
	
	@Override
	public void add(ActivityGroupPO activityGroupPO) {
		
		System.out.println(new Date().getTime()+"＝＝团长："+activityGroupPO.getMemberId());
		System.out.println(new Date().getTime()+"＝＝参与人："+activityGroupPO.getJoinUserId());
		List<ActivityGroup> groups=activityGroupDao.getActivityGroups(activityGroupPO.getMemberId());
		List<ActivityGroupItem> items=activityGroupItemDao.getActivityGroupItemsByMemberId(activityGroupPO.getJoinUserId());
		if(items==null || items.size()<1){
			if(groups!=null && groups.size()>0){//有团可加
				this.joinGroup(activityGroupPO.getJoinUserId(),groups.get(0));
				
			}else{
				ActivityGroup group=new ActivityGroup();
				group.setCreateTime(new Date().getTime());
				group.setStatus(1);
				group.setMemberId(activityGroupPO.getMemberId());
				group.setIsfull(Short.parseShort("0"));
				group.setRemain(2);
				activityGroupDao.add(group);
				
				this.joinGroup(activityGroupPO.getJoinUserId(),group);
				
				JmsMessage jmsMessage=new JmsMessage();
				Map<String, Object> datas=new HashMap<String, Object>();
				datas.put("memberId", activityGroupPO.getMemberId());
				datas.put("type", "groupLeader");
				datas.put("beanId", "eopWXNoticeProcessor");
				jmsMessage.setData(datas);
				jmsMessage.setBeanId("eopWXNoticeProcessor");
				jmsMessage.setData(datas);
				messageSenderThree.send(jmsMessage);			
				
			}
		}				
	}
	
	private void joinGroup(int joinMemberId,ActivityGroup group){
		
		ActivityGroupItem item=new ActivityGroupItem();
		item.setMemberId(joinMemberId);
		item.setJoinTime(new Date().getTime());
		item.setGroupId(group.getGroupId());
		int itemcount=activityGroupItemDao.add(item);
		System.out.println("item ===add:"+itemcount);
		JmsMessage jmsMessage=new JmsMessage();
		Map<String, Object> datas=new HashMap<String, Object>();
		datas.put("memberId", joinMemberId);
		datas.put("type", "sendCoupon");
		datas.put("beanId", "eopWXNoticeProcessor");
		jmsMessage.setData(datas);
		jmsMessage.setBeanId("eopWXNoticeProcessor");
		jmsMessage.setData(datas);
		messageSenderThree.send(jmsMessage);
		
		if(group.getRemain().equals(1)){
				ActivityGroup activityGroup=new ActivityGroup();
				activityGroup.setGroupId(group.getGroupId());
				activityGroup.setRemain(0);
				activityGroup.setIsfull(Short.parseShort("1"));
				activityGroupDao.update(activityGroup);
		}		
		if(group.getRemain().equals(2)){
			ActivityGroup activityGroup=new ActivityGroup();
			activityGroup.setGroupId(group.getGroupId());
			activityGroup.setRemain(1);
			activityGroupDao.update(activityGroup);
			
		}
		if(itemcount>0){
			JmsMessage jmsMessage2=new JmsMessage();
			Map<String, Object> datas2=new HashMap<String, Object>();
			datas2.put("memberId", group.getMemberId());
			datas2.put("groupId", group.getGroupId());
			jmsMessage2.setData(datas2);
			messageSenderTwo.send(jmsMessage2);
		}
		
		
	}

	@Override
	public void addCoupons(ActivityGroup group){
		System.out.println("groupId:"+group.getGroupId());
		//组团成功发放优惠券
		try {
			List<ActivityGroupItem> activityGroupItems=activityGroupItemDao.getActivityGroupItemsByGroupId(group.getGroupId());
			List<Integer> memberIds=new ArrayList<Integer>();
			memberIds.add(group.getMemberId());
			if(activityGroupItems!=null && activityGroupItems.size()>0){
				for(ActivityGroupItem agi:activityGroupItems){
					memberIds.add(agi.getMemberId());
				}
			}
			System.out.println("memberIdds"+memberIds);
			for(Integer mid:memberIds){
				//优惠券列表
				Map<String, Integer> map = new HashMap<String, Integer>(6);
				map.put("139", 10);
				map.put("140", 4);
				map.put("141", 4);
				map.put("142", 2);
				map.put("143", 2);
				map.put("144", 1);			
				for (Entry<String, Integer> entry : map.entrySet()) {
					List<MemberCoupon> memberCoupons=memberCouponDao.getmMemberCouponsByMemberIdAndCpnsId(Integer.parseInt(entry.getKey()), mid);
					if(memberCoupons.size()<1){
						for (int i = 0; i < entry.getValue(); i++) {
							CouponsWithBLOBsPO couponsWithBLOBsPO=couponsDao.getCouponsByCpnsId(Integer.parseInt(entry.getKey()));
							this.sendCoupon(mid, couponsWithBLOBsPO);
						}
					}
				}			
			}
		} catch (Exception e) {
			System.out.println("赠送优惠券发生异常！");
			e.printStackTrace();
		}
	}
	
	private void sendCoupon(int memberId,CouponsWithBLOBsPO couponsWithBLOBsPO){
		MemberCoupon memberCoupon =new MemberCoupon();
		memberCoupon.setBrandId(couponsWithBLOBsPO.getBrandId());
		memberCoupon.setCpnsId(couponsWithBLOBsPO.getCpnsId());
		memberCoupon.setCpnsName(couponsWithBLOBsPO.getCpnsName());
		memberCoupon.setCpnsSn(this.createSn());
		memberCoupon.setCpnsType(couponsWithBLOBsPO.getCpnsType());
		memberCoupon.setDiscountPrice(couponsWithBLOBsPO.getDiscountPrice());
		memberCoupon.setEndTime(couponsWithBLOBsPO.getEndTime());
		memberCoupon.setGetTime(System.currentTimeMillis());
		memberCoupon.setGrantType(couponsWithBLOBsPO.getGrantType());
		memberCoupon.setMemberId(memberId);
		memberCoupon.setOrderAmount(couponsWithBLOBsPO.getOrderAmount());
		memberCoupon.setUsed(Short.parseShort("0"));
		memberCouponDao.add(memberCoupon);
		couponsDao.update(couponsWithBLOBsPO.getCpnsId());
        
	}
	
	private String createSn() {
		String rd = "" + System.currentTimeMillis();
		return StringUtil.md5(rd).substring(0, 22).toUpperCase();

	}
	
}
