package cn.superbio.judicial.cloud.biz.finance;

import cn.superbio.judicial.cloud.biz.finance.entity.FeiMaiProjectEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("/service/api/feimai/project")
@Api(tags = "项目信息")
public interface FeiMaiProjectServiceApi {
    @ApiOperation(value = "获取数据", notes = "获取数据")
    @RequestMapping(value = "/projectList", method = RequestMethod.POST)
    List<FeiMaiProjectEntity> projectList(@RequestBody FeiMaiProjectEntity feiMaiProjectEntity);

    @ApiOperation(value = "新增", notes = "新增")
    @RequestMapping(value = "/sava", method = RequestMethod.POST)
    boolean save(@RequestBody FeiMaiProjectEntity feiMaiProjectEntity);

    @ApiOperation(value = "修改", notes = "修改")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    boolean update(@RequestBody FeiMaiProjectEntity feiMaiProjectEntity);

    @ApiOperation(value = "批量删除", notes = "批量删除")
    @RequestMapping(value = "/remove", method = {RequestMethod.DELETE})
    boolean remove(@RequestParam("ids") List<String> ids);

    @ApiOperation(value = "批量更新", notes = "批量更新")
    @RequestMapping(value = "/updateByIds", method = {RequestMethod.DELETE})
    boolean updateByIds(List<FeiMaiProjectEntity> feiMaiProjectEntity);

    @ApiOperation(value = "获取单条数据", notes = "获取单条数据")
    @RequestMapping(value = "/getOne", method = RequestMethod.POST)
    FeiMaiProjectEntity getOne(@RequestParam("ids") String ids);
}
