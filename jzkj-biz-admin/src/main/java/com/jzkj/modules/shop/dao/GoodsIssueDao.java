package com.jzkj.modules.shop.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jzkj.modules.shop.entity.GoodsIssueEntity;

import java.util.List;
import java.util.Map;

/**
 * Dao
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-23 14:12:34
 */
public interface GoodsIssueDao extends BaseMapper<GoodsIssueEntity> {

    GoodsIssueEntity queryObject(Integer id);

    List<GoodsIssueEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    int save(GoodsIssueEntity goodsIssue);

    int deleteBatch(Integer[] ids);
}
