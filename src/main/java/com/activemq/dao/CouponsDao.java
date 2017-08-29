package com.activemq.dao;

import java.util.List;

import com.activemq.entity.CouponsWithBLOBs;
import com.activemq.entity.po.CouponsWithBLOBsPO;

public interface CouponsDao {

	public CouponsWithBLOBs getCouponsWithBLOB(int cpnsId);
	
	public List<CouponsWithBLOBs> getCouponsWithBLOBs(List<Integer> cpnsIds);
	
	public CouponsWithBLOBsPO getCouponsByCpnsId(Integer cpnsId);
	
	public void update(int cpnsId);
}
