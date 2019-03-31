package com.gasxgj3iotyun.modules.product.dao;

import com.gasxgj3iotyun.miservice.entity.product.ProductTypeBoxEntity;
import com.gasxgj3iotyun.miservice.entity.product.ProductTypeBoxEntityExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ProductTypeBoxDao {
    long countByExample(ProductTypeBoxEntityExample example);

    int deleteByExample(ProductTypeBoxEntityExample example);

    int deleteByPrimaryKey(String productTypeId);

    int insert(ProductTypeBoxEntity record);

    int insertSelective(ProductTypeBoxEntity record);

    List<ProductTypeBoxEntity> selectByExample(ProductTypeBoxEntityExample example);

    ProductTypeBoxEntity selectByPrimaryKey(String productTypeId);

    int updateByExampleSelective(@Param("record") ProductTypeBoxEntity record, @Param("example") ProductTypeBoxEntityExample example);

    int updateByExample(@Param("record") ProductTypeBoxEntity record, @Param("example") ProductTypeBoxEntityExample example);

    int updateByPrimaryKeySelective(ProductTypeBoxEntity record);

    int updateByPrimaryKey(ProductTypeBoxEntity record);

	int deleteByid(String productTypeId);

	List<ProductTypeBoxEntity> selecProductList();

}