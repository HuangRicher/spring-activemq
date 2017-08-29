package com.activemq.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.activemq.entity.ActivityGroup;
import com.activemq.entity.ActivityGroupExample;

public interface ActivityGroupMapper {
    long countByExample(ActivityGroupExample example);

    int deleteByExample(ActivityGroupExample example);

    int deleteByPrimaryKey(Integer groupId);

    int insert(ActivityGroup record);

    int insertSelective(ActivityGroup record);

    List<ActivityGroup> selectByExample(ActivityGroupExample example);

    ActivityGroup selectByPrimaryKey(Integer groupId);

    int updateByExampleSelective(@Param("record") ActivityGroup record, @Param("example") ActivityGroupExample example);

    int updateByExample(@Param("record") ActivityGroup record, @Param("example") ActivityGroupExample example);

    int updateByPrimaryKeySelective(ActivityGroup record);

    int updateByPrimaryKey(ActivityGroup record);
}