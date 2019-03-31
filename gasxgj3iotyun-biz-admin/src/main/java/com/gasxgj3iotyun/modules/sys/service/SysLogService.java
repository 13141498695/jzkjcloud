package com.gasxgj3iotyun.modules.sys.service;


import com.baomidou.mybatisplus.service.IService;
import com.gasxgj3iotyun.common.utils.PageUtils;
import com.gasxgj3iotyun.modules.sys.entity.SysLogEntity;

import java.util.Map;


/**
 * 系统日志
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
