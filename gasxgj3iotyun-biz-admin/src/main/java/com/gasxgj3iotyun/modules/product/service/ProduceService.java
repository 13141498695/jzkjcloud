package com.gasxgj3iotyun.modules.product.service;

import java.util.List;
import java.util.Map;

import com.gasxgj3iotyun.common.utils.PageUtils;
import com.gasxgj3iotyun.miservice.entity.product.ModelEntity;
import com.gasxgj3iotyun.miservice.entity.product.ProductEntity;

public interface ProduceService {

	

	int save(ProductEntity product);

	int update(ProductEntity product);

	int delete(String productid);

	ProductEntity selectByid(String productid);

	PageUtils queryPage(Map<String, Object> params);


}
