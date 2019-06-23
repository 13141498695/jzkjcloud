package com.jzkj.modules.product.service;


import com.baomidou.mybatisplus.service.IService;
import com.com.jzkj.miservice.entity.Barcode.SysBarcodeContext;
import com.jzkj.common.utils.PageUtils;

import java.util.Map;

public interface SysBarcodeContextService extends IService<SysBarcodeContext> {

    PageUtils queryPage(Map<String, Object> params);
}
