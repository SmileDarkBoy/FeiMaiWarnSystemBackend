package cn.superbio.judicial.cloud.biz.finance.controller;

import cn.superbio.judicial.cloud.biz.finance.VO.LoginVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Api(tags = "登陆")
@RequestMapping("/api/Login")
@RestController
public class BusinessLoginController {

    @ApiOperation(value = "登陆", notes = "登陆")
    @RequestMapping(value = "login", method = {RequestMethod.POST})
    public LoginVo login(@RequestParam(value = "userName") String username, @RequestParam(value = "password") String password) {
        LoginVo loginVo = new LoginVo();
        if (username.equals("admin") && password.equals("system")) {
            loginVo.setStatus("ok");
            loginVo.setType("");
            loginVo.setCurrentAuthority("admin");
            return loginVo;
        }
        loginVo.setStatus("error");
        loginVo.setType("");
        loginVo.setCurrentAuthority("guest");
        return loginVo;
    }

}
