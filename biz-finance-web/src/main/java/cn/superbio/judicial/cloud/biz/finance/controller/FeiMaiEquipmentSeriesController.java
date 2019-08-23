package cn.superbio.judicial.cloud.biz.finance.controller;

import cn.superbio.judicial.cloud.biz.finance.consumer.FeiMaiEquipmentSeriesConsumer;
import cn.superbio.judicial.cloud.biz.finance.entity.FeiMaiEquipmentSeriesEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "设备系列管理")
@RequestMapping("/api/equipmentSeries")
@RestController
public class FeiMaiEquipmentSeriesController {
    @Autowired
    private FeiMaiEquipmentSeriesConsumer feiMaiEquipmentSeriesConsumer;

    @ApiOperation(value = "查询列表", notes = "查询列表")
    @RequestMapping(value = "", method = {RequestMethod.GET})
    public List<FeiMaiEquipmentSeriesEntity> list(FeiMaiEquipmentSeriesEntity feiMaiEquipmentSeriesEntity) {
        return feiMaiEquipmentSeriesConsumer.equipmentList(feiMaiEquipmentSeriesEntity);
    }

    @ApiOperation(value = "新增", notes = "新增")
    @RequestMapping(value = "save", method = {RequestMethod.POST})
    public boolean save(@RequestBody FeiMaiEquipmentSeriesEntity feiMaiEquipmentSeriesEntity) {
        return feiMaiEquipmentSeriesConsumer.save(feiMaiEquipmentSeriesEntity);

    }

    @ApiOperation(value = "修改", notes = "修改")
    @RequestMapping(value = "update", method = {RequestMethod.POST})
    public boolean update( @RequestBody FeiMaiEquipmentSeriesEntity feiMaiEquipmentSeriesEntity) {
        return feiMaiEquipmentSeriesConsumer.update(feiMaiEquipmentSeriesEntity);

    }

    @ApiOperation(value = "批量删除", notes = "批量删除")
    @RequestMapping(value = "", method = {RequestMethod.DELETE})
    public boolean remove(@RequestParam(value="ids",required=true) List<String> ids) {
        return feiMaiEquipmentSeriesConsumer.remove(ids);
    }

    @ApiOperation(value = "批量更新", notes = "批量更新")
    @RequestMapping(value = "updateByIds", method = {RequestMethod.POST})
    public boolean updateByIds(@RequestBody List<FeiMaiEquipmentSeriesEntity> feiMaiEquipmentSeriesEntity) {
        return feiMaiEquipmentSeriesConsumer.updateByIds(feiMaiEquipmentSeriesEntity);
    }
}
