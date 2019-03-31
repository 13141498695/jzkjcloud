package com.gasxgj3iotyun.modules.product.service;

import java.util.List;
import java.util.Map;

import com.gasxgj3iotyun.common.utils.PageUtils;
import com.gasxgj3iotyun.miservice.entity.product.BoxEntity;


public interface BoxService {

	int save(BoxEntity box);

	int update(BoxEntity box);

	PageUtils queryPage(Map<String, Object> params);

	void deleteBatchIds(List<String> asList);

	BoxEntity selectById(String boxId);

	List<BoxEntity> getAllBox();

	void delete(List<String> boxIds);
}
