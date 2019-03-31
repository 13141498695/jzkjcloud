package com.gasxgj3iotyun.modules.product.dao;

import com.gasxgj3iotyun.miservice.entity.product.ProductEntity;
import com.gasxgj3iotyun.miservice.entity.product.ProductEntityExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ProductDao {
    long countByExample(ProductEntityExample example);

    int deleteByExample(ProductEntityExample example);

    int deleteByPrimaryKey(String productid);

    int insert(ProductEntity record);

    int insertSelective(ProductEntity record);

    List<ProductEntity> selectByExample(ProductEntityExample example);

    ProductEntity selectByPrimaryKey(String productid);

    int updateByExampleSelective(@Param("record") ProductEntity record, @Param("example") ProductEntityExample example);

    int updateByExample(@Param("record") ProductEntity record, @Param("example") ProductEntityExample example);

    int updateByPrimaryKeySelective(ProductEntity record);

    int updateByPrimaryKey(ProductEntity record);

	List<ProductEntity> productlist();

	int updatedelflag(String productid);

	int deleteByid(String productid);
}