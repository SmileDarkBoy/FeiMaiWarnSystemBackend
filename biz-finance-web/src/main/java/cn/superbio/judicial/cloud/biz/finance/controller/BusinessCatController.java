package cn.superbio.judicial.cloud.biz.finance.controller;

import cn.superbio.judicial.cloud.biz.finance.consumer.BusinessCatConsumer;
import cn.superbio.judicial.cloud.biz.finance.entity.BusinessCatEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "业务管理")
@RequestMapping("/api/Cat")
@RestController
public class BusinessCatController {
//    @Autowired
//    private BusinessCatServiceApi businessCatServiceApi;
    @Autowired
    private BusinessCatConsumer businessCatServiceApi;

    @ApiOperation(value = "查询列表", notes = "查询列表")
    @RequestMapping(value = "", method = {RequestMethod.GET})
    public List<BusinessCatEntity> list(BusinessCatEntity businessCatEntity) {
        return businessCatServiceApi.catList(businessCatEntity);
    }

    @ApiOperation(value = "新增", notes = "新增")
    @RequestMapping(value = "save", method = {RequestMethod.POST})
    public boolean save(@RequestBody BusinessCatEntity businessCatEntity) {
        return businessCatServiceApi.save(businessCatEntity);

    }

    @ApiOperation(value = "修改", notes = "修改")
    @RequestMapping(value = "update", method = {RequestMethod.POST})
    public boolean update( @RequestBody BusinessCatEntity businessCatEntity) {
        return businessCatServiceApi.update(businessCatEntity);

    }

    @ApiOperation(value = "批量删除", notes = "批量删除")
    @RequestMapping(value = "", method = {RequestMethod.DELETE})
    public boolean remove(@RequestParam(value="ids",required=true) List<String> ids) {
        return businessCatServiceApi.remove(ids);
    }

    @ApiOperation(value = "批量更新", notes = "批量更新")
    @RequestMapping(value = "updateByIds", method = {RequestMethod.POST})
    public boolean updateByIds(@RequestBody List<BusinessCatEntity> businessCatEntitys) {
        return businessCatServiceApi.updateByIds(businessCatEntitys);
    }
}
