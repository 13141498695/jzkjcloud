package com.jzkj.modules.shop.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jzkj.modules.shop.dao.KeywordsDao;
import com.jzkj.modules.shop.entity.KeywordsEntity;
import com.jzkj.modules.shop.service.KeywordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


/**
 * 热闹关键词表Service实现类
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-25 21:23:41
 */
@Service("keywordsService")
public class KeywordsServiceImpl  extends ServiceImpl<KeywordsDao, KeywordsEntity> implements KeywordsService {
    @Autowired
    private KeywordsDao keywordsDao;

    @Override
    public KeywordsEntity queryObject(Integer id) {
        return keywordsDao.queryObject(id);
    }

    @Override
    public List<KeywordsEntity> queryList(Map<String, Object> map) {
        return keywordsDao.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return keywordsDao.queryTotal(map);
    }

    @Override
    public int save(KeywordsEntity keywords) {
        return keywordsDao.save(keywords);
    }

    @Override
    public int update(KeywordsEntity keywords) {
        return keywordsDao.updateById(keywords);
    }

    @Override
    public int delete(Integer id) {
        return keywordsDao.deleteById(id);
    }

    @Override
    public int deleteBatch(Integer[]ids) {
        return keywordsDao.deleteBatch(ids);
    }
}
