package com.activemq.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.activemq.entity.MemberCoupon;
import com.activemq.entity.MemberCouponExample;

public interface MemberCouponMapper {
    long countByExample(MemberCouponExample example);

    int deleteByExample(MemberCouponExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MemberCoupon record);

    int insertSelective(MemberCoupon record);

    List<MemberCoupon> selectByExample(MemberCouponExample example);

    MemberCoupon selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MemberCoupon record, @Param("example") MemberCouponExample example);

    int updateByExample(@Param("record") MemberCoupon record, @Param("example") MemberCouponExample example);

    int updateByPrimaryKeySelective(MemberCoupon record);

    int updateByPrimaryKey(MemberCoupon record);
}