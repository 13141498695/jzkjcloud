package com.gasxgj3iotyun.modules.oss.service;

import com.baomidou.mybatisplus.service.IService;
import com.gasxgj3iotyun.common.utils.PageUtils;
import com.gasxgj3iotyun.modules.oss.entity.SysOssEntity;

import java.util.Map;

/**
 * 文件上传
 * 
 * @author  
 * @email  
 * @date  
 */
public interface SysOssService extends IService<SysOssEntity> {

	PageUtils queryPage(Map<String, Object> params);
}
