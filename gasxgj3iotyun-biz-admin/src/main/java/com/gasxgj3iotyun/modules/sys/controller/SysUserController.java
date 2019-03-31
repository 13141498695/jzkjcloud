package com.gasxgj3iotyun.modules.sys.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.gasxgj3iotyun.common.annotation.SysLog;
import com.gasxgj3iotyun.common.utils.MapUtils;
import com.gasxgj3iotyun.common.utils.PageUtils;
import com.gasxgj3iotyun.common.utils.ReturnResult;
import com.gasxgj3iotyun.common.validator.Assert;
import com.gasxgj3iotyun.common.validator.ValidatorUtils;
import com.gasxgj3iotyun.common.validator.group.AddGroup;
import com.gasxgj3iotyun.common.validator.group.UpdateGroup;
import com.gasxgj3iotyun.miservice.entity.customer.CustomerUserEntity;
import com.gasxgj3iotyun.modules.customer.service.CustomerUserService;
import com.gasxgj3iotyun.modules.sys.entity.SysUserEntity;
import com.gasxgj3iotyun.modules.sys.service.SysUserRoleService;
import com.gasxgj3iotyun.modules.sys.service.SysUserService;
import com.gasxgj3iotyun.modules.sys.shiro.ShiroUtils;

import org.apache.commons.lang.ArrayUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * 系统用户
 * 
 * @author 
 * @email 
 * @date 
 */
@RestController
@RequestMapping("/sys/user")
public class SysUserController extends AbstractController {
	@Autowired
	private SysUserService sysUserService;
	@Autowired
	private SysUserRoleService sysUserRoleService;
	@Autowired
	private CustomerUserService customerUserService;
	
	/**
	 * 所有用户列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("sys:user:list")
	public ReturnResult list(@RequestParam Map<String, Object> params){
		PageUtils page = sysUserService.queryPage(params);

		return ReturnResult.ok().put("page", page);
	}
	
	/**
	 * 获取登录的用户信息
	 */
	@RequestMapping("/info")
	public ReturnResult info(){
		return ReturnResult.ok().put("user", getUser());
	}
	
	/**
	 * 修改登录用户密码
	 */
	@SysLog("修改密码")
	@RequestMapping("/password")
	public ReturnResult password(String password, String newPassword){
		Assert.isBlank(newPassword, "新密码不为能空");

		//原密码
		password = ShiroUtils.sha256(password, getUser().getSalt());
		//新密码
		newPassword = ShiroUtils.sha256(newPassword, getUser().getSalt());
				
		//更新密码
		boolean flag = sysUserService.updatePassword(getUserId(), password, newPassword);
		if(!flag){
			return ReturnResult.error("原密码不正确");
		}
		
		return ReturnResult.ok();
	}
	
	/**
	 * 用户信息
	 */
	@RequestMapping("/info/{userId}")
	@RequiresPermissions("sys:user:info")
	public ReturnResult info(@PathVariable("userId") Long userId){
		SysUserEntity user = sysUserService.selectById(userId);
		
		//获取用户所属的角色列表
		List<Long> roleIdList = sysUserRoleService.queryRoleIdList(userId);
		user.setRoleIdList(roleIdList);
		
		return ReturnResult.ok().put("user", user);
	}
	
	/**
	 * 保存用户
	 */
	@SysLog("保存用户")
	@RequestMapping("/save")
	@RequiresPermissions("sys:user:save")
	public ReturnResult save(@RequestBody SysUserEntity user){
		ValidatorUtils.validateEntity(user, AddGroup.class);
		
		sysUserService.save(user);
		
		return ReturnResult.ok();
	}
	
	/**
	 * 修改用户
	 */
	@SysLog("修改用户")
	@RequestMapping("/update")
	@RequiresPermissions("sys:user:update")
	public ReturnResult update(@RequestBody SysUserEntity user){
		ValidatorUtils.validateEntity(user, UpdateGroup.class);

		sysUserService.update(user);
		
		return ReturnResult.ok();
	}
	
	/**
	 * 删除用户
	 */
	@SysLog("删除用户")
	@RequestMapping("/delete")
	@RequiresPermissions("sys:user:delete")
	public ReturnResult delete(@RequestBody Long[] userIds){
		if(ArrayUtils.contains(userIds, 1L)){
			return ReturnResult.error("系统管理员不能删除");
		}
		if(userIds.length>1){
			return ReturnResult.error("不允许删除多个系统用户");
		}
		if(ArrayUtils.contains(userIds, getUserId())){
			return ReturnResult.error("当前用户不能删除");
		}
		sysUserService.deleteSysUserAsList(userIds);
		return ReturnResult.ok();
	}
}
