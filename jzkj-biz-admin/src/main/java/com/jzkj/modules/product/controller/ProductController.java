package com.jzkj.modules.product.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import javax.annotation.Resource;

import com.jzkj.common.annotation.SysLog;
import com.jzkj.modules.product.service.ProduceService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jzkj.common.utils.PageUtils;
import com.jzkj.common.utils.ReturnResult;
import com.jzkj.miservice.entity.product.ProductEntity;

@RestController
@RequestMapping("/sys/product")
public class ProductController {
	/**
	 * 
	 *
	 * @author zhangbin
	 * @date 2019-05-10 15:55:39
	 */

	@Resource
	    private ProduceService produceService;




		/**
		 * 保存产品
		 */
		@SysLog("保存产品")
		@RequestMapping("/add")
		@RequiresPermissions("sys:product:save")
		public ReturnResult save(@RequestBody ProductEntity product){
			String string = java.util.UUID.randomUUID().toString();
			product.setProductId(string);

			product.setCreateTime(new Date());
			produceService.save(product);
			return ReturnResult.ok();
		}
		
		/**
		 * 修改产品
		 */
		@SysLog("修改产品")
		@RequestMapping("/update")
		@RequiresPermissions("sys:product:update")
		public ReturnResult update(@RequestBody ProductEntity product,@PathVariable("deptName") String deptName){
			int i =produceService.update(product);
			return ReturnResult.ok();
		}
		
		
		/**
		 * 查询单个
		 */
		@SysLog("修改单个产品回显")
		@RequestMapping("/info/{productId}")
		/*@RequiresPermissions("sys:model:select")*/
		public ReturnResult select(@PathVariable("productId") String productId){
			ProductEntity	product=this.produceService.selectByid(productId);
			System.out.println("修改查询："+product.getProductName());
			//查询单个用户的信息
			return ReturnResult.ok().put("product", product);
			
			
		}
		
		/**
		 * 删除模型
		 */
		@SysLog("删除模型")
		@RequestMapping("/delete")
		//@ResponseBody
		@RequiresPermissions("sys:product:delete")
		public ReturnResult delete(@RequestBody String [] productId){
			//ValidatorUtils.validateEntity(model, UpdateGroup.class);
		     for (int i = 0; i < productId.length; i++) {
		       produceService.delete(productId[i]);
				 System.out.println("删除的id:"+(productId[i]));

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
