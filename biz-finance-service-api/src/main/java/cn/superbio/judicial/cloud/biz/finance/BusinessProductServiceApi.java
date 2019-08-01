package cn.superbio.judicial.cloud.biz.finance;

import cn.superbio.judicial.cloud.biz.finance.entity.BusinessProductEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RequestMapping("/service/api/finance/Product")
@Api(tags = "后台数据管理")
public interface BusinessProductServiceApi {
    @ApiOperation(value = "获取数据", notes = "获取数据")
    @RequestMapping(value = "/productList", method = RequestMethod.POST)
    List<BusinessProductEntity> productList(@RequestBody BusinessProductEntity businessProductEntity);


    @ApiOperation(value = "获取部门数据", notes = "获取部门数据")
    @RequestMapping(value = "/deptList", method = RequestMethod.POST)
    List<String> deptList();

}
