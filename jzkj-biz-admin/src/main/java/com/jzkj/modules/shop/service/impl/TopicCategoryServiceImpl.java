package com.jzkj.modules.shop.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jzkj.modules.shop.dao.TopicCategoryDao;
import com.jzkj.modules.shop.entity.TopicCategoryEntity;
import com.jzkj.modules.shop.service.TopicCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Service实现类
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-20 15:41:56
 */
@Service("topicCategoryService")
public class TopicCategoryServiceImpl  extends ServiceImpl<TopicCategoryDao, TopicCategoryEntity> implements TopicCategoryService {
    @Autowired
    private TopicCategoryDao topicCategoryDao;

    @Override
    public TopicCategoryEntity queryObject(Integer id) {
        return topicCategoryDao.queryObject(id);
    }

    @Override
    public List<TopicCategoryEntity> queryList(Map<String, Object> map) {
        return topicCategoryDao.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return topicCategoryDao.queryTotal(map);
    }

    @Override
    public int save(TopicCategoryEntity topicCategory) {
        return topicCategoryDao.save(topicCategory);
    }

    @Override
    public int update(TopicCategoryEntity topicCategory) {
        return topicCategoryDao.updateById(topicCategory);
    }

    @Override
    public int delete(Integer id) {
        return topicCategoryDao.deleteById(id);
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        return topicCategoryDao.deleteBatch(ids);
    }
}
