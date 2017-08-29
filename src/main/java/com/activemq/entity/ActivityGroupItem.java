package com.activemq.entity;

import java.io.Serializable;

public class ActivityGroupItem implements Serializable{

	private static final long serialVersionUID = 4888792222556406674L;

	private Integer itemId;

    private Integer groupId;

    private Integer memberId;

    private Long joinTime;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Long getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Long joinTime) {
        this.joinTime = joinTime;
    }
}