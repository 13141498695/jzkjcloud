package com.jzkj.modules.shop.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jzkj.modules.shop.dao.ShippingDao;
import com.jzkj.modules.shop.entity.ShippingEntity;
import com.jzkj.modules.shop.service.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Service实现类
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-09-04 21:42:24
 */
@Service("shippingService")
public class ShippingServiceImpl  extends ServiceImpl<ShippingDao, ShippingEntity> implements ShippingService {
    @Autowired
    private ShippingDao shippingDao;

    @Override
    public ShippingEntity queryObject(Integer id) {
        return shippingDao.queryObject(id);
    }

    @Override
    public List<ShippingEntity> queryList(Map<String, Object> map) {
        return shippingDao.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return shippingDao.queryTotal(map);
    }

    @Override
    public int save(ShippingEntity shipping) {
        return shippingDao.save(shipping);
    }

    @Override
    public int update(ShippingEntity shipping) {
        return shippingDao.updateById(shipping);
    }

    @Override
    public int delete(Integer id) {
        return shippingDao.deleteById(id);
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        return shippingDao.deleteBatch(ids);
    }
}
