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
import org.springframework.web.bind.annotation.RestController;

import com.gasxgj3iotyun.common.annotation.SysLog;
import com.gasxgj3iotyun.common.utils.PageUtils;
import com.gasxgj3iotyun.common.utils.ReturnResult;
import com.gasxgj3iotyun.common.validator.ValidatorUtils;
import com.gasxgj3iotyun.common.validator.group.AddGroup;
import com.gasxgj3iotyun.common.validator.group.UpdateGroup;
import com.gasxgj3iotyun.miservice.entity.product.ModelEntity;
import com.gasxgj3iotyun.miservice.entity.product.ProductEntity;
import com.gasxgj3iotyun.modules.product.service.ModelService;
import com.gasxgj3iotyun.modules.product.service.ProduceService;
import com.gasxgj3iotyun.modules.sys.entity.SysUserEntity;
@RestController
@RequestMapping("/sys/product")
public class ProductController {
	/**
	 * 
	 *
	 * @author zhangbin
	 * @email zhangbin@xgjgas.com
	 * @date 2019-01-10 15:55:39
	 */

	@Resource
	    private ProduceService produceService;
	    
	  
	/**
	 * 
	 *
	 * @author zhangbin
	 * @email zhangbin@xgjgas.com
	 * @date 2019-01-10 15:55:39
	 */

	
		/**
		 * 保存产品
		 */
		@SysLog("保存产品")
		@RequestMapping("/add")
		@RequiresPermissions("sys:product:save")
		public ReturnResult save(@RequestBody ProductEntity product){
			String string = java.util.UUID.randomUUID().toString();
			product.setCreateTime(new Date());
			product.setProductid(string);
			int i=produceService.save(product);
			return ReturnResult.ok();
		}
		
		/**
		 * 修改产品
		 */
		@SysLog("修改产品")
		@RequestMapping("/update")
		@RequiresPermissions("sys:product:update")
		public ReturnResult update(@RequestBody ProductEntity product){
			int i =produceService.update(product);
			return ReturnResult.ok();
		}
		
		
		/**
		 * 查询单个
		 */
		@SysLog("修改单个产品回显")
		@RequestMapping("/info/{productid}")
		/*@RequiresPermissions("sys:model:select")*/
		public ReturnResult select(@PathVariable("productid") String productid){
			ProductEntity	product=this.produceService.selectByid(productid);
			System.out.println("修改查询："+product.getProductName());
			//查询单个用户的信息
			return ReturnResult.ok().put("product", product);
			
			
		}
		
		/**
		 * 删除模型
		 */
		@SysLog("修改产品")
		@RequestMapping("/delete")
		//@ResponseBody
		@RequiresPermissions("sys:product:delete")
		public ReturnResult delete(@RequestBody String [] productid){
			//ValidatorUtils.validateEntity(model, UpdateGroup.class);
			System.out.println("删除的id:"+(Arrays.asList(productid)));
			
		     for (int i = 0; i < productid.length; i++) {
		    	 produceService.delete(productid[i]);;
		    }
			
			return ReturnResult.ok();

			
		}
		
		/**
		 * 产品列表		 */
		@SysLog("产品列表")
		@RequestMapping("/list")
	  @RequiresPermissions("sys:product:list")
		public ReturnResult list(@RequestParam Map<String, Object> params){
			PageUtils page = produceService.queryPage(params);
        System.out.println("页面："+page);
			return ReturnResult.ok().put("page", page);
		}
		
}
