package com.activemq.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.activemq.entity.ActivityGroupItem;
import com.activemq.entity.ActivityGroupItemExample;

public interface ActivityGroupItemMapper {
    long countByExample(ActivityGroupItemExample example);

    int deleteByExample(ActivityGroupItemExample example);

    int deleteByPrimaryKey(Integer itemId);

    int insert(ActivityGroupItem record);

    int insertSelective(ActivityGroupItem record);

    List<ActivityGroupItem> selectByExample(ActivityGroupItemExample example);

    ActivityGroupItem selectByPrimaryKey(Integer itemId);

    int updateByExampleSelective(@Param("record") ActivityGroupItem record, @Param("example") ActivityGroupItemExample example);

    int updateByExample(@Param("record") ActivityGroupItem record, @Param("example") ActivityGroupItemExample example);

    int updateByPrimaryKeySelective(ActivityGroupItem record);

    int updateByPrimaryKey(ActivityGroupItem record);
}