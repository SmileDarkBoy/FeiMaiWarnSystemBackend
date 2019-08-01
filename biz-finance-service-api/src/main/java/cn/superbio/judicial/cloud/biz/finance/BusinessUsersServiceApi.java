package cn.superbio.judicial.cloud.biz.finance;

import cn.superbio.judicial.cloud.biz.finance.entity.BusinessUsersEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RequestMapping("/service/api/finance/Users")
@Api(tags = "人员")
public interface BusinessUsersServiceApi {
    @ApiOperation(value = "获取数据", notes = "获取数据")
    @RequestMapping(value = "/usersList", method = RequestMethod.POST)
    List<BusinessUsersEntity> usersList(@RequestBody BusinessUsersEntity businessUsersEntity);

}
