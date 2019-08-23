package cn.superbio.judicial.cloud.biz.finance.controller;

import cn.superbio.judicial.cloud.biz.finance.consumer.FeiMaiProjectConsumer;
import cn.superbio.judicial.cloud.biz.finance.entity.FeiMaiProjectEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "项目信息")
@RequestMapping("/api/project")
@RestController
public class FeiMaiProjectController {
    @Autowired
    private FeiMaiProjectConsumer feiMaiProjectConsumer;

    @ApiOperation(value = "查询列表", notes = "查询列表")
    @RequestMapping(value = "list", method = {RequestMethod.GET})
    public List<FeiMaiProjectEntity> list(FeiMaiProjectEntity feiMaiProjectEntity) {
        return feiMaiProjectConsumer.projectList(feiMaiProjectEntity);
    }

    @ApiOperation(value = "新增", notes = "新增")
    @RequestMapping(value = "save", method = {RequestMethod.POST})
    public boolean save(@RequestBody FeiMaiProjectEntity feiMaiProjectEntity) {
        return feiMaiProjectConsumer.save(feiMaiProjectEntity);

    }

    @ApiOperation(value = "修改", notes = "修改")
    @RequestMapping(value = "update", method = {RequestMethod.POST})
    public boolean update( @RequestBody FeiMaiProjectEntity feiMaiProjectEntity) {
        return feiMaiProjectConsumer.update(feiMaiProjectEntity);

    }

    @ApiOperation(value = "批量删除", notes = "批量删除")
    @RequestMapping(value = "remove", method = {RequestMethod.DELETE})
    public boolean remove(@RequestParam(value="ids",required=true) List<String> ids) {
        return feiMaiProjectConsumer.remove(ids);
    }

    @ApiOperation(value = "批量更新", notes = "批量更新")
    @RequestMapping(value = "updateByIds", method = {RequestMethod.POST})
    public boolean updateByIds(@RequestBody List<FeiMaiProjectEntity> feiMaiProjectEntity) {
        return feiMaiProjectConsumer.updateByIds(feiMaiProjectEntity);
    }
    @ApiOperation(value = "查询单个", notes = "查询单个")
    @RequestMapping(value = "getOne", method = {RequestMethod.GET})
    FeiMaiProjectEntity getOne(@RequestParam(value="ids",required=true) String ids) {
        return feiMaiProjectConsumer.getOne(ids);
    }
}
