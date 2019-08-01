package cn.superbio.judicial.cloud.biz.finance.controller;

import cn.superbio.judicial.cloud.biz.finance.consumer.BusinessPersonsConsumer;
import cn.superbio.judicial.cloud.biz.finance.entity.BusinessPersonsEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "人员配置")
@RequestMapping("/api/Persons")
@RestController
public class BusinessPersonsController {
    @Autowired
//    private BusinessPersonsServiceApi businessPersonsServiceApi;
    private BusinessPersonsConsumer businessPersonsServiceApi;

    @ApiOperation(value = "查询列表", notes = "查询列表")
    @RequestMapping(value = "", method = {RequestMethod.GET})
    public List<BusinessPersonsEntity> list(BusinessPersonsEntity businessPersonsEntity) {
        return businessPersonsServiceApi.personsList(businessPersonsEntity);
    }

    @ApiOperation(value = "新增", notes = "新增")
    @RequestMapping(value = "save", method = {RequestMethod.POST})
    public boolean save(@RequestBody BusinessPersonsEntity businessPersonsEntity) {
        return businessPersonsServiceApi.save(businessPersonsEntity);

    }
    @ApiOperation(value = "修改", notes = "修改")
    @RequestMapping(value = "update", method = {RequestMethod.POST})
    public boolean update( @RequestBody BusinessPersonsEntity businessPersonsEntity) {
        return businessPersonsServiceApi.update(businessPersonsEntity);

    }

    @ApiOperation(value = "批量删除", notes = "批量删除")
    @RequestMapping(value = "", method = {RequestMethod.DELETE})
    public boolean remove(@RequestParam(value="ids",required=true) List<String> ids) {
        return businessPersonsServiceApi.remove(ids);
    }
}
