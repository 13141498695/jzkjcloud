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
import com.gasxgj3iotyun.modules.product.dao.ModelDao;
import com.gasxgj3iotyun.modules.product.dao.ProductDao;
import com.gasxgj3iotyun.modules.product.service.ModelService;
import com.gasxgj3iotyun.modules.product.service.ProduceService;
import com.gasxgj3iotyun.modules.sys.dao.SysDeptDao;
import com.gasxgj3iotyun.modules.sys.entity.SysDeptEntity;
import com.gasxgj3iotyun.modules.sys.service.SysDeptService;
import com.github.pagehelper.PageHelper;

@Service("ProduceService")
public class ProductServlceImpl implements ProduceService {
@Resource
private  ProductDao productdao;
	@Override
	public int save(ProductEntity product) {
		// TODO Auto-generated method stub
		return productdao.insertSelective(product);
	}

	@Override
	public int update(ProductEntity product) {
		// TODO Auto-generated method stub
		return this.productdao.updateByPrimaryKeySelective(product);
	}

	@Override
	public int delete(String productid) {
		// TODO Auto-generated method stub
		return this.productdao.deleteByid(productid);
	}

	@Override
	public ProductEntity selectByid(String productid) {
		// TODO Auto-generated method stub
		return this.productdao.selectByPrimaryKey(productid);
	}

	@Override
	public PageUtils queryPage(Map<String, Object> params) {
		 String productName = (String)params.get("productName");

		Page<ProductEntity> page = new Query<ProductEntity>(params).getPage();
        PageHelper.startPage(page.getCurrent(), page.getSize());  
        
        ProductEntityExample example=new ProductEntityExample();
    	ProductEntityExample.Criteria  criteria=example.createCriteria();

        if(productName!=null){
        	criteria.andProductNameLike("%"+productName+"%");
        }
        Byte delflag=0;
        criteria.andDelFlagEqualTo(delflag);
        List<ProductEntity> allItems = productdao.selectByExample(example);
        long total = productdao.countByExample(example);
        
        System.out.println("total:"+total);
        page.setTotal((int)total);
        page.setRecords(allItems);
        return new PageUtils(page);
	}


	

}
