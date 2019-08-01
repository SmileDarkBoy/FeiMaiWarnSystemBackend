package cn.superbio.judicial.cloud.biz.finance;

import cn.superbio.judicial.cloud.biz.finance.entity.BusinessCatEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("/service/api/finance/Cat")
@Api(tags = "业务类型")
public interface BusinessCatServiceApi {
    @ApiOperation(value = "获取数据", notes = "获取数据")
    @RequestMapping(value = "/catList", method = RequestMethod.POST)
    List<BusinessCatEntity> catList(@RequestBody BusinessCatEntity businessCatEntity);

    @ApiOperation(value = "新增", notes = "新增")
    @RequestMapping(value = "/save", method = {RequestMethod.POST})
    boolean save(@RequestBody BusinessCatEntity businessCatEntity);

    @ApiOperation(value = "修改", notes = "修改")
    @RequestMapping(value = "/update", method = {RequestMethod.POST})
    boolean update(@RequestBody BusinessCatEntity businessCatEntity);

    @ApiOperation(value = "批量删除", notes = "批量删除")
    @RequestMapping(value = "/remove", method = {RequestMethod.DELETE})
    boolean remove(@RequestParam("ids") List<String> ids);

    @ApiOperation(value = "批量更新", notes = "批量更新")
    @RequestMapping(value = "/updateByIds", method = {RequestMethod.DELETE})
    boolean updateByIds(List<BusinessCatEntity> businessCatEntitys);

}
