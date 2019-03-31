package com.gasxgj3iotyun.modules.product.service;

import java.util.List;
import java.util.Map;

import com.gasxgj3iotyun.common.utils.PageUtils;
import com.gasxgj3iotyun.miservice.entity.product.ModelEntity;
import com.gasxgj3iotyun.miservice.entity.product.ProductEntity;
import com.gasxgj3iotyun.miservice.entity.product.ProductTypeBoxEntity;

public interface ProduceTypeService {
	
	int save(ProductTypeBoxEntity productTypeBoxEntity);


	int delete(String productid);

	ProductTypeBoxEntity selectByid(String productid);

	PageUtils queryPage(Map<String, Object> params);
	int update(ProductTypeBoxEntity productTypeBoxEntity);


	List<ProductTypeBoxEntity> seletecProductList();


}
