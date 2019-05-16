package com.jzkj.controller;


import com.jzkj.annotation.Login;
import com.jzkj.annotation.LoginUser;
import com.jzkj.common.utils.ReturnResult;
import com.jzkj.entity.UserEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * 测试接口
 */
@RestController
@RequestMapping("/api")
@Api(tags="测试接口")
public class ApiTestController {

    @Login
    @GetMapping("userInfo")
    @ApiOperation(value="获取用户信息", response= UserEntity.class)
    public ReturnResult userInfo(@ApiIgnore @LoginUser UserEntity user){
        return ReturnResult.ok().put("user", user);
    }

    @Login
    @GetMapping("userId")
    @ApiOperation("获取用户ID")
    public ReturnResult userInfo(@ApiIgnore @RequestAttribute("userId") Integer userId){
        return ReturnResult.ok().put("userId", userId);
    }

    @GetMapping("notToken")
    @ApiOperation("忽略Token验证测试")
    public ReturnResult notToken(){
        return ReturnResult.ok().put("msg", "无需token也能访问。。。");
    }

}
