package com.gasxgj3iotyun.service;


import com.baomidou.mybatisplus.service.IService;
import com.gasxgj3iotyun.entity.UserEntity;
import com.gasxgj3iotyun.form.LoginForm;

import java.util.Map;

/**
 * 用户
 */
public interface UserService extends IService<UserEntity> {

	UserEntity queryByMobile(String mobile);

	/**
	 * 用户登录
	 * @param form    登录表单
	 * @return        返回登录信息
	 */
	Map<String, Object> login(LoginForm form);
}
