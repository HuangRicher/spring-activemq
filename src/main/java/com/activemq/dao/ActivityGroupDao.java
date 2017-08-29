package com.activemq.dao;

import java.util.List;

import com.activemq.entity.ActivityGroup;

public interface ActivityGroupDao {

	public List<ActivityGroup> getActivityGroups(Integer memberId);
	
	public void updateByGroupId(Integer groupId);
	
	public int add(ActivityGroup activityGroup);
	
	public ActivityGroup getActivityGroup(int groupId);
	
	public void update(ActivityGroup activityGroup);
}
