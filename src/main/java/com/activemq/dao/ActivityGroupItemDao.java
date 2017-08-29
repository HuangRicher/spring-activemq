package com.activemq.dao;

import java.util.List;

import com.activemq.entity.ActivityGroupItem;

public interface ActivityGroupItemDao {

	public int add(ActivityGroupItem activityGroupItem);
	
	public List<ActivityGroupItem> getActivityGroupItemsByGroupId(int groupId);
	
	public List<ActivityGroupItem> getActivityGroupItemsByMemberId(int memberId);
}
