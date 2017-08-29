package com.activemq.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.activemq.entity.Coupons;
import com.activemq.entity.CouponsExample;
import com.activemq.entity.CouponsWithBLOBs;

public interface CouponsMapper {
    long countByExample(CouponsExample example);

    int deleteByExample(CouponsExample example);

    int deleteByPrimaryKey(Integer cpnsId);

    int insert(CouponsWithBLOBs record);

    int insertSelective(CouponsWithBLOBs record);

    List<CouponsWithBLOBs> selectByExampleWithBLOBs(CouponsExample example);

    List<Coupons> selectByExample(CouponsExample example);

    CouponsWithBLOBs selectByPrimaryKey(Integer cpnsId);

    int updateByExampleSelective(@Param("record") CouponsWithBLOBs record, @Param("example") CouponsExample example);

    int updateByExampleWithBLOBs(@Param("record") CouponsWithBLOBs record, @Param("example") CouponsExample example);

    int updateByExample(@Param("record") Coupons record, @Param("example") CouponsExample example);

    int updateByPrimaryKeySelective(CouponsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CouponsWithBLOBs record);

    int updateByPrimaryKey(Coupons record);
}