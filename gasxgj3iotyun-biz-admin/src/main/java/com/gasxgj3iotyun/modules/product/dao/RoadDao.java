package com.gasxgj3iotyun.modules.product.dao;

import com.gasxgj3iotyun.miservice.entity.product.RoadEntity;
import com.gasxgj3iotyun.miservice.entity.product.RoadEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoadDao {
    long countByExample(RoadEntityExample example);

    int deleteByExample(RoadEntityExample example);

    int deleteByPrimaryKey(String roadId);

    int insert(RoadEntity record);

    int insertSelective(RoadEntity record);

    List<RoadEntity> selectByExample(RoadEntityExample example);

    RoadEntity selectByPrimaryKey(String roadId);

    int updateByExampleSelective(@Param("record") RoadEntity record, @Param("example") RoadEntityExample example);

    int updateByExample(@Param("record") RoadEntity record, @Param("example") RoadEntityExample example);

    int updateByPrimaryKeySelective(RoadEntity record);

    int updateByPrimaryKey(RoadEntity record);   
}