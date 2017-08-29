package com.activemq.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.activemq.dao.ActivityGroupDao;
import com.activemq.entity.ActivityGroup;
import com.activemq.entity.ActivityGroupExample;
import com.activemq.mapper.ActivityGroupMapper;
@Repository
public class ActivityGroupDaoImpl implements ActivityGroupDao {

	@Autowired
	private ActivityGroupMapper activityGroupMapper;
	
	@Override
	public List<ActivityGroup> getActivityGroups(Integer memberId) {
		ActivityGroupExample example=new ActivityGroupExample();
		example.createCriteria().andMemberIdEqualTo(memberId).andIsfullEqualTo(Short.parseShort("0"));
		example.setOrderByClause(" group_id desc ");
		return activityGroupMapper.selectByExample(example);
	}

	@Override
	public void updateByGroupId(Integer groupId) {
		

	}

	@Override
	public int add(ActivityGroup activityGroup) {
		return activityGroupMapper.insertSelective(activityGroup);

	}

	@Override
	public ActivityGroup getActivityGroup(int groupId) {
		
		return activityGroupMapper.selectByPrimaryKey(groupId);
	}

	@Override
	public void update(ActivityGroup activityGroup) {
		
		activityGroupMapper.updateByPrimaryKeySelective(activityGroup);
	}

}
