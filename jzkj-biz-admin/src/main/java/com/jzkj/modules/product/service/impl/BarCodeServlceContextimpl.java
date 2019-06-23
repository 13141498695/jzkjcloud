package com.jzkj.modules.product.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.com.jzkj.miservice.entity.Barcode.SysBarcodeContext;
import com.jzkj.common.annotation.DataFilter;
import com.jzkj.common.utils.Constant;
import com.jzkj.common.utils.PageUtils;
import com.jzkj.common.utils.Query;
import com.jzkj.modules.product.dao.SysBarcodeContextDao;
import com.jzkj.modules.product.service.SysBarcodeContextService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service("BarCodeContextService")
public class BarCodeServlceContextimpl extends ServiceImpl<SysBarcodeContextDao, SysBarcodeContext> implements SysBarcodeContextService {
@Resource
    private SysBarcodeContextDao sysBarcodeContextao;

@DataFilter(subDept = true, user = false)
public PageUtils queryPage(Map<String, Object> params) {
    Page<SysBarcodeContext> page = this.selectPage(
            new Query<SysBarcodeContext>(params).getPage(),
            new EntityWrapper<SysBarcodeContext>()
                    .addFilterIfNeed(params.get(Constant.SQL_FILTER) != null, (String)params.get(Constant.SQL_FILTER))
    );
    return new PageUtils(page);
}


}
