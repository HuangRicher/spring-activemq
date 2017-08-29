package com.activemq.dao;

import java.util.List;

import com.activemq.entity.MemberCoupon;

public interface MemberCouponDao {

	public List<MemberCoupon> getmMemberCouponsByMemberIdAndCpnsId(int cpnsId,int memberId);
	
	public void add(MemberCoupon memberCoupon);
	
}
