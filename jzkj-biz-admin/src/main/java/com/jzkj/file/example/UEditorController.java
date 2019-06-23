package com.jzkj.file.example;


import com.jzkj.common.exception.ResultException;
import com.jzkj.common.utils.ReturnResult;
import com.jzkj.file.ActionEnter;
import com.jzkj.modules.oss.cloud.OSSFactory;
import com.jzkj.modules.oss.entity.SysOssEntity;
import com.jzkj.modules.oss.service.SysOssService;
import com.jzkj.modules.sys.service.SysConfigService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Created by ldb on 2017/4/9.
 */
@Controller
public class UEditorController {
    @Autowired
    private SysOssService sysOssService;
    @Autowired
    private SysConfigService sysConfigService;

    @RequestMapping("/")
    private String showPage(){

        return "index";
    }

    @RequestMapping(value="/config")
    public void config(HttpServletRequest request, HttpServletResponse response) throws JSONException {
        response.setContentType("application/json");
        String rootPath = request.getSession().getServletContext().getRealPath("/");
        try {
            String exec = new ActionEnter(request, rootPath).exec();
            PrintWriter writer = response.getWriter();
            writer.write(exec);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @RequestMapping("/uploadimage")
    //@RequiresPermissions("sys:oss:all")
    public ReturnResult uploadimage(@RequestParam("file") MultipartFile file) throws Exception {
        if (file.isEmpty()) {
            throw new ResultException("上传文件不能为空");
        }
        //上传文件
        String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        String url = OSSFactory.build().uploadSuffix(file.getBytes(), suffix);

        //保存文件信息
        SysOssEntity ossEntity = new SysOssEntity();
        ossEntity.setUrl(url);
        ossEntity.setCreateDate(new Date());
        sysOssService.insert(ossEntity);
        return ReturnResult.ok().put("url", url);
    }
}
