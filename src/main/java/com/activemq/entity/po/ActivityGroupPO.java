package com.activemq.entity.po;

import com.activemq.entity.ActivityGroup;

public class ActivityGroupPO extends ActivityGroup {

	private static final long serialVersionUID = -5338687741997962538L;

	private int joinUserId;

	public int getJoinUserId() {
		return joinUserId;
	}

	public void setJoinUserId(int joinUserId) {
		this.joinUserId = joinUserId;
	}
	
	
}
