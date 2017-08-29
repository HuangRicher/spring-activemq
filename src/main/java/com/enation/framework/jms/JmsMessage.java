package com.enation.framework.jms;

import java.io.Serializable;

public class JmsMessage implements Serializable{

	private static final long serialVersionUID = 4042590893039605089L;

	private Object data;
	
	private String beanId;

	private Integer memberId;
	
	private Integer joinUserId;
	
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getBeanId() {
		return beanId;
	}

	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public Integer getJoinUserId() {
		return joinUserId;
	}

	public void setJoinUserId(Integer joinUserId) {
		this.joinUserId = joinUserId;
	}
	
	
}
