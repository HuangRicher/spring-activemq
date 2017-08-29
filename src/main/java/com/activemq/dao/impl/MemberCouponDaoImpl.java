package com.activemq.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.activemq.dao.MemberCouponDao;
import com.activemq.entity.MemberCoupon;
import com.activemq.entity.MemberCouponExample;
import com.activemq.mapper.MemberCouponMapper;
@Repository
public class MemberCouponDaoImpl implements MemberCouponDao {

	@Autowired
	private MemberCouponMapper memberCouponMapper;
	
	@Override
	public List<MemberCoupon> getmMemberCouponsByMemberIdAndCpnsId(int cpnsId,int memberId) {
		MemberCouponExample example=new MemberCouponExample();
		example.createCriteria().andMemberIdEqualTo(memberId).andCpnsIdEqualTo(cpnsId);
		return memberCouponMapper.selectByExample(example);
	}

	@Override
	public void add(MemberCoupon memberCoupon) {
		
		memberCouponMapper.insertSelective(memberCoupon);
	}

}
