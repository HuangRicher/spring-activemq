package com.activemq.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.activemq.dao.ActivityGroupItemDao;
import com.activemq.entity.ActivityGroupItem;
import com.activemq.entity.ActivityGroupItemExample;
import com.activemq.mapper.ActivityGroupItemMapper;
@Repository
public class ActivityGroupItemDaoImpl implements ActivityGroupItemDao {

	@Autowired
	private ActivityGroupItemMapper activityGroupItemMapper;
	
	@Override
	public int add(ActivityGroupItem activityGroupItem) {
		
		return activityGroupItemMapper.insertSelective(activityGroupItem);
	}

	@Override
	public List<ActivityGroupItem> getActivityGroupItemsByGroupId(int groupId) {
		ActivityGroupItemExample example=new ActivityGroupItemExample();
		example.createCriteria().andGroupIdEqualTo(groupId);
		return activityGroupItemMapper.selectByExample(example);
	}

	@Override
	public List<ActivityGroupItem> getActivityGroupItemsByMemberId(int memberId) {
		ActivityGroupItemExample example=new ActivityGroupItemExample();
		example.createCriteria().andMemberIdEqualTo(memberId);
		return activityGroupItemMapper.selectByExample(example);
	}

}
