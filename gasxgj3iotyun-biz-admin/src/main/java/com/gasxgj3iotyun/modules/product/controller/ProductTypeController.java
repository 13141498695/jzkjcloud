package com.gasxgj3iotyun.modules.product.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.ArrayUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gasxgj3iotyun.common.annotation.SysLog;
import com.gasxgj3iotyun.common.utils.PageUtils;
import com.gasxgj3iotyun.common.utils.ReturnResult;
import com.gasxgj3iotyun.common.validator.ValidatorUtils;
import com.gasxgj3iotyun.common.validator.group.AddGroup;
import com.gasxgj3iotyun.common.validator.group.UpdateGroup;
import com.gasxgj3iotyun.miservice.entity.product.ModelEntity;
import com.gasxgj3iotyun.miservice.entity.product.ProductEntity;
import com.gasxgj3iotyun.miservice.entity.product.ProductTypeBoxEntity;
import com.gasxgj3iotyun.modules.product.service.ModelService;
import com.gasxgj3iotyun.modules.product.service.ProduceService;
import com.gasxgj3iotyun.modules.product.service.ProduceTypeService;
import com.gasxgj3iotyun.modules.sys.entity.SysUserEntity;
@RestController
@RequestMapping("/sys/producttype")
public class ProductTypeController {
	/**
	 * 
	 *
	 * @author zhangbin
	 * @email zhangbin@xgjgas.com
	 * @date 2019-01-10 15:55:39
	 */

	    @Resource
	    private ProduceTypeService produceTypeService;
	
		/**
		 * 保存产品类型
		 */
		@SysLog("保存产品类型")
		@RequestMapping("/add")
		@RequiresPermissions("sys:producttype:save")
		public ReturnResult save(@RequestBody ProductTypeBoxEntity  productTypeBoxEntity){
			String string = java.util.UUID.randomUUID().toString();
			productTypeBoxEntity.setProductTypeId(string);
			productTypeBoxEntity.setCreateTime(new Date());
			int i=this.produceTypeService.save(productTypeBoxEntity);
			return ReturnResult.ok();
		}
		/**
		 * 修改产品
		 */
		@SysLog("修改产品")
		@RequestMapping("/update")
		@RequiresPermissions("sys:producttype:update")
		public ReturnResult update(@RequestBody ProductTypeBoxEntity productTypeBoxEntity){
			int i =produceTypeService.update(productTypeBoxEntity);
			return ReturnResult.ok();
		}
		
		
		/**
		 * 查询单个
		 */
		@SysLog("修改产品类型单个产品回显")
		@RequestMapping("/info/{productTypeId}")
		/*@RequiresPermissions("sys:model:select")*/
		public ReturnResult select(@PathVariable("productTypeId") String productTypeId){
			ProductTypeBoxEntity producttype=produceTypeService.selectByid(productTypeId);
			//查询单个用户的信息
			return ReturnResult.ok().put("producttype", producttype);
		}
		/**
		 * 查询产品类型所有
		 */
		@SysLog("修改产品类型所有")
		@RequestMapping("/infoList")
		@ResponseBody
		public List<ProductTypeBoxEntity> selectList(){
			List<ProductTypeBoxEntity>  list=produceTypeService.seletecProductList();
			//查询单个用户的信息
			System.out.println("产品类型所有："+list.size());
			return list;
		}
		
		/**
		 * 删除产品类型
		 */
		@SysLog("删除产品类型")
		@RequestMapping("/delete")
		@RequiresPermissions("sys:producttype:delete")
		public ReturnResult delete(@RequestBody String [] productTypeId){
			//ValidatorUtils.validateEntity(model, UpdateGroup.class);
			System.out.println("删除的id:"+(Arrays.asList(productTypeId)));
		     for (int i = 0; i < productTypeId.length; i++) {
		    	 produceTypeService.delete(productTypeId[i]);
		    }
			
			return ReturnResult.ok();
		}
		
		/**
		 * 产品类型列表		 
		 * */
		@SysLog("类型列表")
		@RequestMapping("/list")
	  @RequiresPermissions("sys:producttype:list")
		public ReturnResult list(@RequestParam Map<String, Object> params){
			PageUtils page = produceTypeService.queryPage(params);
        System.out.println("页面："+page);
			return ReturnResult.ok().put("page", page);
		}
		
}
