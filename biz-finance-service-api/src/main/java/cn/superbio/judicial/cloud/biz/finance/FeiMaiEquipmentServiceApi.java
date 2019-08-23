package cn.superbio.judicial.cloud.biz.finance;

import cn.superbio.judicial.cloud.biz.finance.entity.FeiMaiEquipmentEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("/service/api/feimai/equipment")
@Api(tags = "设备类型")
public interface FeiMaiEquipmentServiceApi {
    @ApiOperation(value = "获取数据", notes = "获取数据")
    @RequestMapping(value = "/equipmentList", method = RequestMethod.POST)
    List<FeiMaiEquipmentEntity> equipmentList(@RequestBody FeiMaiEquipmentEntity feiMaiEquipmentEntity);

    @ApiOperation(value = "新增", notes = "新增")
    @RequestMapping(value = "/sava", method = RequestMethod.POST)
    boolean save(@RequestBody FeiMaiEquipmentEntity feiMaiEquipmentEntity);

    @ApiOperation(value = "修改", notes = "修改")
    @RequestMapping(value = "/update",method=RequestMethod.POST)
    boolean update (@RequestBody FeiMaiEquipmentEntity feiMaiEquipmentEntity);

    @ApiOperation(value = "批量删除", notes = "批量删除")
    @RequestMapping(value = "/remove", method = {RequestMethod.DELETE})
    boolean remove(@RequestParam("ids") List<String> ids);

    @ApiOperation(value = "批量更新", notes = "批量更新")
    @RequestMapping(value = "/updateByIds", method = {RequestMethod.DELETE})
    boolean updateByIds(List<FeiMaiEquipmentEntity> feiMaiEquipmentEntity);
}
