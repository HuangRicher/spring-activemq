package com.activemq.service.vo;

import java.io.Serializable;
 
public class AmqMessage implements Serializable {

	private static final long serialVersionUID = -7091874876197615236L;
	
	private Object data;
	private String beanid;
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String getBeanid() {
		return beanid;
	}
	public void setBeanid(String beanid) {
		this.beanid = beanid;
	}
	
	
}
