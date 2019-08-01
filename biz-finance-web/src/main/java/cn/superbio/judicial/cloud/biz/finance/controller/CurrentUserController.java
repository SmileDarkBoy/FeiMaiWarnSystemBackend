package cn.superbio.judicial.cloud.biz.finance.controller;

import cn.superbio.judicial.cloud.biz.finance.VO.Users;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Api(tags = "判断登陆")
@RequestMapping("/api")
@RestController
public class CurrentUserController {
    //    @RequestMapping(value = "/currentUser")
//    public String getxxxList(){
//        return "redirect:/user/login";//重定向
//    }
    @ApiOperation(value = "判断登陆", notes = "判断登陆")
    @RequestMapping(value = "/currentUser", method = {RequestMethod.GET})
    public Users list() {
        Users users = new Users();
        users.setName("管理员");
        users.setAvatar("https://gw.alipayobjects.com/zos/rmsportal/BiazfanxmamNRoxxVxka.png");
        users.setNotifyCount(12);
        return users;
    }

}
