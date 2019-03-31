package com.gasxgj3iotyun.modules.customer.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gasxgj3iotyun.miservice.entity.customer.CustomerUserEntity;
import com.gasxgj3iotyun.modules.customer.dao.CustomerUserDao;
import com.gasxgj3iotyun.modules.customer.service.CustomerTokenService;
import com.gasxgj3iotyun.modules.customer.service.CustomerUserService;

@Service("customerUserService")
public class CustomerUserServiceImpl extends ServiceImpl<CustomerUserDao, CustomerUserEntity> implements CustomerUserService {
	@Autowired
	private CustomerTokenService tokenService;

	@Override
	public CustomerUserEntity queryByMobile(String mobile) {
		CustomerUserEntity userEntity = new CustomerUserEntity();
		userEntity.setMobile(mobile);
		return baseMapper.selectOne(userEntity);
	}

	

}
