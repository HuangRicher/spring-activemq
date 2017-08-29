package com.activemq.service;

import com.activemq.entity.ActivityGroup;
import com.activemq.entity.po.ActivityGroupPO;

public interface ActivityGroupService {

	public void add(ActivityGroupPO activityGroupPO);
	
	public void addCoupons(ActivityGroup group);
}
