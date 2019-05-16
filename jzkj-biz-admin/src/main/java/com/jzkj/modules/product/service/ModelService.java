package com.jzkj.modules.product.service;

import java.util.List;
import java.util.Map;

import com.jzkj.common.utils.PageUtils;
import com.jzkj.miservice.entity.product.ModelEntity;

/**
 * 
 *
 * @author zhangbin
 * @email zhangbin@xgjgas.com
 * @date 2019-01-10 13:55:39
 */
public interface ModelService {

    PageUtils queryPage(Map<String, Object> params);

	int save(ModelEntity model);

	List<ModelEntity> selectmodellist();


	void delete(String modelId);

	int update(ModelEntity model);

	ModelEntity selectmodellist(String modelid);
}

