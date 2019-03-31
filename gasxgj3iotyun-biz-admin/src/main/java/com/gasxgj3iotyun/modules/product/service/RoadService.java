package com.gasxgj3iotyun.modules.product.service;

import java.util.List;
import java.util.Map;

import com.gasxgj3iotyun.common.utils.PageUtils;
import com.gasxgj3iotyun.miservice.entity.product.RoadEntity;


public interface RoadService {

	int save(RoadEntity road);

	int update(RoadEntity road);

	PageUtils queryPage(Map<String, Object> params);

	void deleteBatchIds(List<String> asList);

	RoadEntity selectById(String roadId);

	List<RoadEntity> getRoadByBoxId(String boxId);

	void delete(List<String> roadId);

	int updateByBoxId(List<String> boxIds);
}
