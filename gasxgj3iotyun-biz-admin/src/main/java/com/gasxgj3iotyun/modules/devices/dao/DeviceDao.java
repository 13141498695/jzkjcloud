package com.gasxgj3iotyun.modules.devices.dao;

import com.gasxgj3iotyun.miservice.entity.devices.DeviceEntity;
import com.gasxgj3iotyun.miservice.entity.devices.DeviceEntityExample;
import com.gasxgj3iotyun.miservice.entity.product.ModelEntity;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DeviceDao {
	
	
	
    long countByExample(DeviceEntityExample example);

    int deleteByExample(DeviceEntityExample example);

    int deleteByPrimaryKey(String deviceId);

    int insert(DeviceEntity record);

    int insertSelective(DeviceEntity record);

    List<DeviceEntity> selectByExample(DeviceEntityExample example);

    DeviceEntity selectByPrimaryKey(String deviceId);

    int updateByExampleSelective(@Param("record") DeviceEntity record, @Param("example") DeviceEntityExample example);

    int updateByExample(@Param("record") DeviceEntity record, @Param("example") DeviceEntityExample example);

    int updateByPrimaryKeySelective(DeviceEntity record);

    int updateByPrimaryKey(DeviceEntity record);

	List<DeviceEntity> selectlist();
}