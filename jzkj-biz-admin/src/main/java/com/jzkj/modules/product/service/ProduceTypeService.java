package com.jzkj.modules.product.service;

import java.util.List;
import java.util.Map;

import com.jzkj.common.utils.PageUtils;
import com.jzkj.miservice.entity.product.ProductTypeBoxEntity;

public interface ProduceTypeService {
	
	int save(ProductTypeBoxEntity productTypeBoxEntity);


	int delete(String productid);

	ProductTypeBoxEntity selectByid(String productid);

	PageUtils queryPage(Map<String, Object> params);
	int update(ProductTypeBoxEntity productTypeBoxEntity);


	List<ProductTypeBoxEntity> seletecProductList();


}
