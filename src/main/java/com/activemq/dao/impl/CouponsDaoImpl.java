package com.activemq.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.activemq.dao.CouponsDao;
import com.activemq.entity.CouponsExample;
import com.activemq.entity.CouponsWithBLOBs;
import com.activemq.entity.po.CouponsWithBLOBsPO;
import com.activemq.mapper.CouponsMapper;
import com.activemq.mapper.extend.CouponsExtMapper;
@Repository
public class CouponsDaoImpl implements CouponsDao {

	@Autowired
	private CouponsMapper couponsMapper;
	@Autowired
	private CouponsExtMapper couponsExtMapper;
	
	@Override
	public CouponsWithBLOBs getCouponsWithBLOB(int cpnsId) {
		
		return couponsMapper.selectByPrimaryKey(cpnsId);
	}

	@Override
	public List<CouponsWithBLOBs> getCouponsWithBLOBs(List<Integer> cpnsIds) {
		CouponsExample example=new CouponsExample();
		example.createCriteria().andCpnsIdIn(cpnsIds);
		return couponsMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public CouponsWithBLOBsPO getCouponsByCpnsId(Integer cpnsId) {
		
		return  couponsExtMapper.selectCouponsByCpnsId(cpnsId);
	}

	@Override
	public void update(int cpnsId) {
		
		couponsExtMapper.updateCoupons(cpnsId);
	}

}
