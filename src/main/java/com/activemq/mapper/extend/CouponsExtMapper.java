package com.activemq.mapper.extend;

import org.apache.ibatis.annotations.Param;

import com.activemq.entity.po.CouponsWithBLOBsPO;

public interface CouponsExtMapper {

	public CouponsWithBLOBsPO selectCouponsByCpnsId(@Param("cpnsId") Integer cpnsId);
	
	public void updateCoupons(@Param("cpnsId") Integer cpnsId);
}
