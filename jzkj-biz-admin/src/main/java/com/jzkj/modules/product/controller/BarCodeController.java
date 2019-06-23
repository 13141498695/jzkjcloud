package com.jzkj.modules.product.controller;

import com.com.jzkj.miservice.entity.Barcode.SysBarcode;
import com.com.jzkj.miservice.entity.Barcode.SysBarcodeContext;
import com.jzkj.common.annotation.SysLog;
import com.jzkj.common.utils.PageUtils;
import com.jzkj.common.utils.ReturnResult;

import com.jzkj.modules.oss.service.SysOssService;
import com.jzkj.modules.product.service.BarCodeService;
import com.jzkj.modules.product.service.ProduceService;
import com.jzkj.modules.product.service.SysBarcodeContextService;
import com.jzkj.modules.sys.entity.SysUserEntity;
import com.jzkj.modules.sys.service.SysConfigService;
import com.jzkj.modules.until.QRCodeUtil;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/sys/barcode")
public class BarCodeController {
    /**
     *
     *
     * @author zhangbin
     * @date 2019-06-5 11:55:39
     */

    @Resource
    private BarCodeService barCodeervice;
     @Resource
    private ProduceService produceService;

    @Resource
    private SysBarcodeContextService sysBarcodeContextService;

    @Autowired
    private SysOssService sysOssService;
    @Autowired
    private SysConfigService sysConfigService;
    /**
     * 二维码申请修改
     */
    @ApiOperation("二维码申请修改")
    @SysLog("二维码申请修改")
    @RequestMapping("/update")
    @ResponseBody
 @RequiresPermissions("sys:barcode:update")
    public ReturnResult update(@RequestBody SysBarcode sysBarcode){
String id=sysBarcode.getProductId();
        String text = "http://47.95.208.93:8073/info?productId="+id;
        System.out.println("产品"+sysBarcode.getProductId());
        System.out.println("路径"+text);
        // 嵌入二维码的图片路径

        String destPath=null;
        try {
            int count= sysBarcode.getScCount()          ;
          for (int i = 0; i < count; i++) {
              String imgPath = "C:/Users/zhangbin/Desktop/zhangbin/jzkj/biz-admin/statics/image/image/20190618/logo.png";
              destPath = "/Users/zhangbin/Desktop/zhangbin/jzkj/C:/Users/zhangbin/Desktop/zhangbin/jzkj/biz-admin/statics/image/image/qr" + i+new Date()+sysBarcode.getProductId() + ".jpg";
              //生成二维码


              QRCodeUtil.encode(text, imgPath, destPath, true);
//              MultipartFile file = (MultipartFile) new File(destPath);
//              File s  =new File("destPath");
//              //上传文件
//              String suffix =file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
//              String url = OSSFactory.build().uploadSuffix(file.getBytes(), suffix);
//
//              //保存文件信息
//              SysOssEntity ossEntity = new SysOssEntity();
//              ossEntity.setUrl(url);
//              ossEntity.setCreateDate(new Date());
//              sysOssService.insert(ossEntity);

          }
        } catch (Exception e) {
            System.out.println("生成二维码异常");
            e.printStackTrace();
        }
        // 解析二维码,这里只是将上面的text解析出来了，所以扫描结果就是一串字符串
        String str = null;
        try {
            str = QRCodeUtil.decode(destPath);
        } catch (Exception e) {
            System.out.println("解析二维码异常");
            e.printStackTrace();
        }
        // 打印出解析出的内容
        System.out.println(str);


//        try {
//            int count= sysBarcode.getScCount()          ;
//            for (int i = 0; i < count; i++) {
//                //生成二维码
//                String imgPath = "C:/Users/zhangbin/Desktop/zhangbin/jzkj/biz-admin/statics/image/image/20190606/1559803979023073497.jpeg";
//                destPath = "/Users/zhangbin/Desktop/zhangbin/jzkj/C:/Users/zhangbin/Desktop/zhangbin/jzkj/biz-admin/statics/image/image/qr"+i+".jpg";
//                QRCodeUtil.encode(text, imgPath+new Date(), destPath, true);
//                SysBarcodeContext sysBarcodeContext=new SysBarcodeContext();
//                sysBarcodeContext.setBarcodeAddress("北京");
//                sysBarcodeContext.setBarcodeUrl(destPath);
//                sysBarcodeContext.setId(java.util.UUID.randomUUID().toString());
//                System.out.println("输出二维码");
//                this.sysBarcodeContextService.insert(sysBarcodeContext);
//            }
//        } catch (Exception e) {
//            System.out.println("生成二维码异常");
//            e.printStackTrace();
//        }
//        // 解析二维码,这里只是将上面的text解析出来了，所以扫描结果就是一串字符串
//        String str = null;
//        try {
//            str = QRCodeUtil.decode(destPath);
//        } catch (Exception e) {
//            System.out.println("解析二维码异常");
//            e.printStackTrace();
//        }
        sysBarcode.setCreateTime(new Date());
        sysBarcode.setBarcodeStatus(1);
        barCodeervice.updateAllColumnById(sysBarcode);

        return ReturnResult.ok();
    }


    /**
     * 二维码申请修改
     */
    @ApiOperation("二维码申请修改")
    @SysLog("二维码申请修改")
    @RequestMapping("/scBarcode")
    @ResponseBody
   // @RequiresPermissions("sys:barcode:update")
    public ReturnResult scBarcode(@RequestBody SysBarcode sysBarcode){
        String id=sysBarcode.getProductId();
        String text = "http://192.168.1.100:8073/info?productId="+id;
        System.out.println("产品"+sysBarcode.getProductId());
        System.out.println("路径"+text);
        // 嵌入二维码的图片路径
        String imgPath = "C:/Users/zhangbin/Desktop/zhangbin/jzkj/biz-admin/statics/image/image/20190618/logo.png";

        String destPath = "/Users/zhangbin/Desktop/zhangbin/jzkj/C:/Users/zhangbin/Desktop/zhangbin/jzkj/biz-admin/statics/image/image/qr.jpg";
        try {
            int count= sysBarcode.getScCount()          ;
            for (int i = 0; i < count; i++) {
                //生成二维码
                QRCodeUtil.encode(text, imgPath+new Date(), destPath, true);
                SysBarcodeContext sysBarcodeContext=new SysBarcodeContext();
                sysBarcodeContext.setBarcodeAddress("北京");
                sysBarcodeContext.setBarcodeUrl(destPath);
                sysBarcodeContext.setId(java.util.UUID.randomUUID().toString());
                System.out.println("输出二维码");
                this.sysBarcodeContextService.insert(sysBarcodeContext);
            }
        } catch (Exception e) {
            System.out.println("生成二维码异常");
            e.printStackTrace();
        }
        // 解析二维码,这里只是将上面的text解析出来了，所以扫描结果就是一串字符串
        String str = null;
        try {
            str = QRCodeUtil.decode(destPath);
        } catch (Exception e) {
            System.out.println("解析二维码异常");
            e.printStackTrace();
        }
        sysBarcode.setCreateTime(new Date());
        sysBarcode.setBarcodeStatus(1);
        barCodeervice.updateAllColumnById(sysBarcode);
        return ReturnResult.ok();
    }


    /**
     * 二维码申请修改
     */
    @ApiOperation("二维码申请修改")
    @SysLog("二维码申请修改")
    @RequestMapping("/add")
    @RequiresPermissions("sys:barcode:save")
    @ResponseBody
    public ReturnResult add(@RequestBody SysBarcode sysBarcode){
        sysBarcode.setCreateTime(new Date());
        String username = ((SysUserEntity) SecurityUtils.getSubject().getPrincipal()).getUsername();
        sysBarcode.setCreatePeople(username);
        barCodeervice.insertAllColumn(sysBarcode);
        return ReturnResult.ok();
    }

    /**
     * 二维码修改回显查询
     */
    @ApiOperation("二维码修改回显查询")
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:role:info")
    @ResponseBody
    public ReturnResult info(@PathVariable("id") int id){
        SysBarcode barcode = barCodeervice.selectById(id);
        System.out.println("查询单个用户的信息"+barcode.getCreateTime());
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
    @ResponseBody
    public ReturnResult delete(@RequestBody int[] id){

        for (int i = 0; i < id.length; i++) {
            barCodeervice.deleteById(id[i]);
        }
        return ReturnResult.ok();
    }

    /**
     * 二维码修改回显查询		 */
    @SysLog("二维码修改回显查询")
    @ApiOperation("二维码申请列表")
    @RequestMapping("/list")
   @RequiresPermissions("sys:barcode:list")
    @ResponseBody
    public ReturnResult list(@RequestParam Map<String, Object> params){
        PageUtils page = barCodeervice.queryPage(params);
        System.out.println("页面："+page);

        return ReturnResult.ok().put("page", page);
    }



}
