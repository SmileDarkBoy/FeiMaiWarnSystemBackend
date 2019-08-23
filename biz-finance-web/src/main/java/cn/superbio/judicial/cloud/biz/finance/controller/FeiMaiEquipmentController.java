package cn.superbio.judicial.cloud.biz.finance.controller;

import cn.superbio.judicial.cloud.biz.finance.consumer.FeiMaiEquipmentConsumer;
import cn.superbio.judicial.cloud.biz.finance.entity.FeiMaiEquipmentEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "设备管理")
@RequestMapping("/api/equipment")
@RestController
public class FeiMaiEquipmentController {
    @Autowired
    private FeiMaiEquipmentConsumer feiMaiEquipmentConsumer;

    @ApiOperation(value = "查询列表", notes = "查询列表")
    @RequestMapping(value = "list", method = {RequestMethod.GET})
    public List<FeiMaiEquipmentEntity> list( FeiMaiEquipmentEntity feiMaiEquipmentEntity) {
        return feiMaiEquipmentConsumer.equipmentList(feiMaiEquipmentEntity);
    }

    @ApiOperation(value = "新增", notes = "新增")
    @RequestMapping(value = "save", method = {RequestMethod.POST})
    public boolean save(@RequestBody FeiMaiEquipmentEntity feiMaiEquipmentEntity) {
        return feiMaiEquipmentConsumer.save(feiMaiEquipmentEntity);

    }

    @ApiOperation(value = "修改", notes = "修改")
    @RequestMapping(value = "update", method = {RequestMethod.POST})
    public boolean update( @RequestBody FeiMaiEquipmentEntity feiMaiEquipmentEntity) {
        return feiMaiEquipmentConsumer.update(feiMaiEquipmentEntity);

    }

    @ApiOperation(value = "批量删除", notes = "批量删除")
    @RequestMapping(value = "remove", method = {RequestMethod.DELETE})
    public boolean remove(@RequestParam(value="ids",required=true) List<String> ids) {
        return feiMaiEquipmentConsumer.remove(ids);
    }

    @ApiOperation(value = "批量更新", notes = "批量更新")
    @RequestMapping(value = "updateByIds", method = {RequestMethod.POST})
    public boolean updateByIds(@RequestBody List<FeiMaiEquipmentEntity> feiMaiEquipmentEntity) {
        return feiMaiEquipmentConsumer.updateByIds(feiMaiEquipmentEntity);
    }

}
