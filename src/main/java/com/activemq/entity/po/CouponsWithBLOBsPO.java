package com.activemq.entity.po;

import com.activemq.entity.CouponsWithBLOBs;

public class CouponsWithBLOBsPO extends CouponsWithBLOBs {

	private static final long serialVersionUID = 4687994615669157275L;

	private String comName;
	
	private String brandName;

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	
}
