package com.jzkj.modules.product.service;

import java.util.Map;

import com.jzkj.common.utils.PageUtils;
import com.jzkj.miservice.entity.product.ProductEntity;

public interface ProduceService {

	

	int save(ProductEntity product);

	int update(ProductEntity product);

	int delete(String productId);

	ProductEntity selectByid(String productid);

	PageUtils queryPage(Map<String, Object> params);


}
