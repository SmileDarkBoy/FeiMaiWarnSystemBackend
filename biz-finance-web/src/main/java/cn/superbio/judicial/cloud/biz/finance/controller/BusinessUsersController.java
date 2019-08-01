package cn.superbio.judicial.cloud.biz.finance.controller;


import cn.superbio.judicial.cloud.biz.finance.BusinessUsersServiceApi;
import cn.superbio.judicial.cloud.biz.finance.entity.BusinessUsersEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "人员查询")
@RequestMapping("/api/Users")
@RestController
public class BusinessUsersController {
    @Autowired
    private BusinessUsersServiceApi businessUsersServiceApi;

    @ApiOperation(value = "查询列表", notes = "查询列表")
    @RequestMapping(value = "", method = {RequestMethod.GET})
    public List<BusinessUsersEntity> list(BusinessUsersEntity businessUsersEntity) {
        return businessUsersServiceApi.usersList(businessUsersEntity);
    }

}
