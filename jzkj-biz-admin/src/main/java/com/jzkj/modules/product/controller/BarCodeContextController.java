package com.jzkj.modules.product.controller;

import com.com.jzkj.miservice.entity.Barcode.SysBarcodeContext;
import com.jzkj.common.annotation.SysLog;
import com.jzkj.common.utils.PageUtils;
import com.jzkj.common.utils.ReturnResult;
import com.jzkj.modules.product.service.ProduceService;
import com.jzkj.modules.product.service.SysBarcodeContextService;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/sys/barcodeContext")
public class BarCodeContextController {
    /**
     *
     *
     * @author zhangbin
     * @date 2019-06-5 11:55:39
     */

    @Resource
    private ProduceService produceService;
    @Resource
    private SysBarcodeContextService sysBarcodeContextService;





    /**
     * 二维码申请修改
     */
    @ApiOperation("二维码申请修改")
    @SysLog("二维码申请修改")
    @RequestMapping("/update")
 @RequiresPermissions("sys:barcode:update")
    public ReturnResult update(@RequestBody SysBarcodeContext sysBarcodeContext){
        sysBarcodeContextService.updateAllColumnById(sysBarcodeContext);
        return ReturnResult.ok();
    }
//
//    /**
//     * 二维码申请修改
//     */
//    @ApiOperation("二维码申请修改")
//    @SysLog("二维码申请修改")
//    @RequestMapping("/add")
//    @RequiresPermissions("sys:barcode:save")
//    public ReturnResult add(@RequestBody SysBarcodeContext sysBarcodeContext){
//        sysBarcodeContext.s(new Date());
//        String username = ((SysUserEntity) SecurityUtils.getSubject().getPrincipal()).getUsername();
//        sysBarcode.setCreatePeople(username);
//        sysBarcodeContextService.insertAllColumn(sysBarcode);
//        return ReturnResult.ok();
//    }

    /**
     * 二维码修改回显查询
     */
    @ApiOperation("二维码修改回显查询")
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:role:info")
    public ReturnResult info(@PathVariable("id") int id){
        SysBarcodeContext barcode = sysBarcodeContextService.selectById(id);
        //查询单个用户的信息
        return ReturnResult.ok().put("barcode", barcode);

    }

    /**
     * 删除模型
     */
    @ApiOperation("删除模型")
    @SysLog("产品模型")
    @RequestMapping("/delete")
    //@ResponseBody
    @RequiresPermissions("sys:barcode:delete")
    public ReturnResult delete(@RequestBody int[] id){

        for (int i = 0; i < id.length; i++) {
            sysBarcodeContextService.deleteById(id[i]);
        }
        return ReturnResult.ok();
    }

    /**
     * 二维码修改回显查询		 */
    @SysLog("二维码修改回显查询")
    @ApiOperation("二维码申请列表")
    @RequestMapping("/list")
   @RequiresPermissions("sys:barcode:list")
    public ReturnResult list(@RequestParam Map<String, Object> params){
        PageUtils page = sysBarcodeContextService.queryPage(params);
        System.out.println("页面："+page);

        return ReturnResult.ok().put("page", page);
    }



}
