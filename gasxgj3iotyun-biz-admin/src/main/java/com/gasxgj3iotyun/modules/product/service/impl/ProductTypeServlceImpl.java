package com.gasxgj3iotyun.modules.product.service.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gasxgj3iotyun.common.utils.PageUtils;
import com.gasxgj3iotyun.common.utils.Query;
import com.gasxgj3iotyun.miservice.entity.product.ModelEntity;
import com.gasxgj3iotyun.miservice.entity.product.ModelEntityExample;
import com.gasxgj3iotyun.miservice.entity.product.ProductEntity;
import com.gasxgj3iotyun.miservice.entity.product.ProductEntityExample;
import com.gasxgj3iotyun.miservice.entity.product.ProductTypeBoxEntity;
import com.gasxgj3iotyun.miservice.entity.product.ProductTypeBoxEntityExample;
import com.gasxgj3iotyun.modules.product.dao.ModelDao;
import com.gasxgj3iotyun.modules.product.dao.ProductDao;
import com.gasxgj3iotyun.modules.product.dao.ProductTypeBoxDao;
import com.gasxgj3iotyun.modules.product.service.ModelService;
import com.gasxgj3iotyun.modules.product.service.ProduceService;
import com.gasxgj3iotyun.modules.product.service.ProduceTypeService;
import com.gasxgj3iotyun.modules.sys.dao.SysDeptDao;
import com.gasxgj3iotyun.modules.sys.entity.SysDeptEntity;
import com.gasxgj3iotyun.modules.sys.service.SysDeptService;
import com.github.pagehelper.PageHelper;

@Service("ProduceTypeService")
public class ProductTypeServlceImpl implements ProduceTypeService {
@Resource
private  ProductTypeBoxDao producttypedao;
	
	@Override
	public PageUtils queryPage(Map<String, Object> params) {
		/*
		 String productName = (String)params.get("productName");

			Page<ProductEntity> page = new Query<ProductEntity>(params).getPage();
	        PageHelper.startPage(page.getCurrent(), page.getSize());  
	        
	        ProductEntityExample example=new ProductEntityExample();
	        if(productName!=null){
	        	ProductEntityExample.Criteria  criteria=example.createCriteria();
	        	criteria.andProductNameLike("%"+productName+"%");
	        }
	        List<ProductEntity> allItems = productdao.selectByExample(example);
	        long total = productdao.countByExample(example);
	        
	        System.out.println("total:"+total);
	        page.setTotal((int)total);
	        page.setRecords(allItems);
	        return new PageUtils(page);*/
		String productTypeName = (String)params.get("productTypeName");
		Page<ProductTypeBoxEntity> page = new Query<ProductTypeBoxEntity>(params).getPage();
        PageHelper.startPage(page.getCurrent(), page.getSize()); 
        ProductTypeBoxEntityExample  example =new ProductTypeBoxEntityExample();
    	ProductTypeBoxEntityExample.Criteria  criteria=example.createCriteria();

        if(productTypeName!=null){
        	criteria.andProductTypeNameLike("%"+productTypeName+"%");
        }
        Byte delflag=0;
        criteria.andDelFlagEqualTo(delflag);
        List<ProductTypeBoxEntity> allItems = producttypedao.selectByExample(example);
        long total = producttypedao.countByExample(example);

        page.setTotal((int)total);
        page.setRecords(allItems);
        return new PageUtils(page);
        
        
	}






	@Override
	public int delete(String productTypeId) {
		// TODO Auto-generated method stub
		return this.producttypedao.deleteByid(productTypeId);
	}

	@Override
	public int save(ProductTypeBoxEntity productTypeBoxEntity) {
		// TODO Auto-generated method stub
		return this.producttypedao.insertSelective(productTypeBoxEntity);
	}


	@Override
	public ProductTypeBoxEntity selectByid(String productTypeId) {
		// TODO Auto-generated method stub
		return this.producttypedao.selectByPrimaryKey(productTypeId);
	}






	






	@Override
	public int update(ProductTypeBoxEntity productTypeBoxEntity) {
		// TODO Auto-generated method stub
		return this.producttypedao.updateByPrimaryKeySelective(productTypeBoxEntity);
	}






	@Override
	public List<ProductTypeBoxEntity> seletecProductList() {
		// TODO Auto-generated method stub
		return this.producttypedao.selecProductList();
	}








	

}
