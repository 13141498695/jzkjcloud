package com.gasxgj3iotyun.modules.devices.service;

import java.util.List;

import com.gasxgj3iotyun.miservice.entity.devices.DeviceModelRelationEntity;
import com.gasxgj3iotyun.miservice.entity.product.ModelEntity;

public interface DeviceModelRelationService {

	List<String> getModelId(String devicesId);

	int save(DeviceModelRelationEntity deviceModelRelationEntity);

	int deleteByDeviceId(String deviceId);
	
	int deleteByModelId(String modelId);

}
