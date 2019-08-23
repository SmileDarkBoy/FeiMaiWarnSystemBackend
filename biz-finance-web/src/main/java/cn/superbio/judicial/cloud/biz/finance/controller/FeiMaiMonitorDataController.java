package cn.superbio.judicial.cloud.biz.finance.controller;

import cn.superbio.judicial.cloud.biz.finance.consumer.FeiMaiMonitorDataConsumer;
import cn.superbio.judicial.cloud.biz.finance.consumer.FeiMaiProjectConsumer;
import cn.superbio.judicial.cloud.biz.finance.entity.FeiMaiMonitorDataEntity;
import cn.superbio.judicial.cloud.biz.finance.entity.FeiMaiProjectEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "监测数据")
@RequestMapping("/api/monitor")
@RestController
public class FeiMaiMonitorDataController {
    @Autowired
    private FeiMaiMonitorDataConsumer feiMaiMonitorDataConsumer;

    @ApiOperation(value = "查询列表", notes = "查询列表")
    @RequestMapping(value = "list", method = {RequestMethod.GET})
    public List<FeiMaiMonitorDataEntity> list(FeiMaiMonitorDataEntity feiMaiMonitorDataEntity) {
        return feiMaiMonitorDataConsumer.monitorList(feiMaiMonitorDataEntity);
    }

    @ApiOperation(value = "新增", notes = "新增")
    @RequestMapping(value = "save", method = {RequestMethod.POST})
    public boolean save(@RequestBody FeiMaiMonitorDataEntity feiMaiMonitorDataEntity) {
        return feiMaiMonitorDataConsumer.save(feiMaiMonitorDataEntity);

    }

    @ApiOperation(value = "修改", notes = "修改")
    @RequestMapping(value = "update", method = {RequestMethod.POST})
    public boolean update( @RequestBody FeiMaiMonitorDataEntity feiMaiMonitorDataEntity) {
        return feiMaiMonitorDataConsumer.update(feiMaiMonitorDataEntity);

    }

    @ApiOperation(value = "批量删除", notes = "批量删除")
    @RequestMapping(value = "remove", method = {RequestMethod.DELETE})
    public boolean remove(@RequestParam(value="ids",required=true) List<String> ids) {
        return feiMaiMonitorDataConsumer.remove(ids);
    }

    @ApiOperation(value = "批量更新", notes = "批量更新")
    @RequestMapping(value = "updateByIds", method = {RequestMethod.POST})
    public boolean updateByIds(@RequestBody List<FeiMaiMonitorDataEntity> feiMaiMonitorDataEntity) {
        return feiMaiMonitorDataConsumer.updateByIds(feiMaiMonitorDataEntity);
    }
    @ApiOperation(value = "查询单个", notes = "查询单个")
    @RequestMapping(value = "getOne", method = {RequestMethod.GET})
    FeiMaiMonitorDataEntity getOne(@RequestParam(value="ids",required=true) String ids) {
        return feiMaiMonitorDataConsumer.getOne(ids);
    }
}
