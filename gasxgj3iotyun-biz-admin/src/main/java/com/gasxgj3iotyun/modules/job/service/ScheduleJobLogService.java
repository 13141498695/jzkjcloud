package com.gasxgj3iotyun.modules.job.service;

import com.baomidou.mybatisplus.service.IService;
import com.gasxgj3iotyun.common.utils.PageUtils;
import com.gasxgj3iotyun.modules.job.entity.ScheduleJobLogEntity;

import java.util.Map;

/**
 * 定时任务日志
 *
 * @author 
 * @since 
 */
public interface ScheduleJobLogService extends IService<ScheduleJobLogEntity> {

	PageUtils queryPage(Map<String, Object> params);
	
}
