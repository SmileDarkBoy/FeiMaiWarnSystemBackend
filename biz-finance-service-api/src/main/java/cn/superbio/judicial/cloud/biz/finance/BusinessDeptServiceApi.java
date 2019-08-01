package cn.superbio.judicial.cloud.biz.finance;

import cn.superbio.judicial.cloud.biz.finance.entity.BusinessDeptEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RequestMapping("/service/api/finance/Dept")
@Api(tags = "部门管理")
public interface BusinessDeptServiceApi {
    @ApiOperation(value = "获取数据", notes = "获取数据")
    @RequestMapping(value = "/deptList", method = RequestMethod.POST)
    List<BusinessDeptEntity> deptList(@RequestBody BusinessDeptEntity businessdeptEntity);

}
