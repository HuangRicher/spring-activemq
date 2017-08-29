package com.activemq.entity;

import java.io.Serializable;

public class ActivityGroup implements Serializable{

	private static final long serialVersionUID = 3002564915744075429L;

	private Integer groupId;

    private Integer memberId;

    private Integer status;

    private Long createTime;

    private Short isfull;

    private Integer remain;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Short getIsfull() {
        return isfull;
    }

    public void setIsfull(Short isfull) {
        this.isfull = isfull;
    }

    public Integer getRemain() {
        return remain;
    }

    public void setRemain(Integer remain) {
        this.remain = remain;
    }
}