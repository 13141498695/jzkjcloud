package com.gasxgj3iotyun.modules.customer.service;


import java.util.Map;

import com.baomidou.mybatisplus.service.IService;
import com.gasxgj3iotyun.miservice.entity.customer.CustomerUserEntity;

/**
 * 用户 APP
 */
public interface CustomerUserService extends IService<CustomerUserEntity> {

	CustomerUserEntity queryByMobile(String mobile);

	
}
