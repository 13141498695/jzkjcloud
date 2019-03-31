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
import com.gasxgj3iotyun.modules.product.service.ModelService;
import com.gasxgj3iotyun.modules.sys.entity.SysUserEntity;
@RestController
@RequestMapping("/sys/model")
public class ModelController {
	/**
	 * 
	 *
	 * @author zhangbin
	 * @email zhangbin@xgjgas.com
	 * @date 2019-01-10 15:55:39
	 */

	   @Resource
	    private ModelService modelService;
	    
	  
		/**
		 * 保存模型
		 */
		@SysLog("保存模型")
		@RequestMapping("/add")
		@RequiresPermissions("sys:model:save")
		public ReturnResult save(@RequestBody ModelEntity model){
			String string = java.util.UUID.randomUUID().toString();
			model.setCreatetime(new Date());
			model.setModelId(string);
			int i=modelService.save(model);
			
			
			return ReturnResult.ok();
		}
		
		/**
		 * 修改模型
		 */
		@SysLog("修改模型")
		@RequestMapping("/update")
		@RequiresPermissions("sys:model:update")
		public ReturnResult update(@RequestBody ModelEntity model){
			int i =modelService.update(model);
			return ReturnResult.ok();
		}
		
		
		/**
		 * 查询单个
		 */
		@SysLog("修改模型回显")
		@RequestMapping("/info/{modelId}")
/*		@RequiresPermissions("sys:model:select")
*/		public ReturnResult select(@PathVariable("modelId") String modelId){
			ModelEntity model=this.modelService.selectmodellist(modelId);
			System.out.println("修改查询："+model.getModelName());
			//修改模型回显
			return ReturnResult.ok().put("model", model);
			
			
		}
		
		/**
		 * 删除模型
		 */
		@SysLog("删除模型")
		@RequestMapping("/delete")
		//@ResponseBody
		@RequiresPermissions("sys:model:delete")
		public ReturnResult delete(@RequestBody String [] modelId){
			//ValidatorUtils.validateEntity(model, UpdateGroup.class);
			System.out.println("删除的id:"+(Arrays.asList(modelId)));
			
		     for (int i = 0; i < modelId.length; i++) {
		      	modelService.delete(modelId[i]);;
		    }
			
			return ReturnResult.ok();

			
		}
		
		/**
		 * 模型列表
		 */
		@SysLog("模型列表")
		@RequestMapping("/list")
	  @RequiresPermissions("sys:model:list")
		public ReturnResult list(@RequestParam Map<String, Object> params){
			PageUtils page = modelService.queryPage(params);
        System.out.println("页面："+page);
			return ReturnResult.ok().put("page", page);
		}
		
		/**
		 * 模型列表
		 */
		@SysLog("模型列表")
		@RequestMapping("/modellist")
	  //@RequiresPermissions("sys:model:modellist")
		@ResponseBody
		public List<ModelEntity> modellistlist(){
			List<ModelEntity> list=this.modelService.selectmodellist();
			System.out.println(list.size());
			return list;
		}
			

}
