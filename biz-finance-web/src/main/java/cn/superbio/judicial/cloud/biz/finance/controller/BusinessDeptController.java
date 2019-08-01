package cn.superbio.judicial.cloud.biz.finance.controller;


import cn.superbio.judicial.cloud.biz.finance.consumer.BusinessDeptConsumer;
import cn.superbio.judicial.cloud.biz.finance.entity.BusinessDeptEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "部门查询")
@RequestMapping("/api/Dept")
@RestController
public class BusinessDeptController {
    @Autowired
//    private BusinessDeptServiceApi businessDeptServiceApi;
    private BusinessDeptConsumer businessDeptServiceApi;


    @ApiOperation(value = "查询列表", notes = "查询列表")
    @RequestMapping(value = "", method = {RequestMethod.GET})
    public List<BusinessDeptEntity> list(BusinessDeptEntity businessDeptEntity) {
        return businessDeptServiceApi.deptList(businessDeptEntity);
    }
}
