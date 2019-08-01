package cn.superbio.judicial.cloud.biz.finance.provider;

import cn.superbio.judicial.cloud.biz.finance.BusinessDeptServiceApi;
import cn.superbio.judicial.cloud.biz.finance.DO.BusinessDeptDO;
import cn.superbio.judicial.cloud.biz.finance.entity.BusinessDeptEntity;
import cn.superbio.judicial.cloud.biz.finance.service.BusinessDeptService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Service
@RestController
public class BusinessDeptProvider implements BusinessDeptServiceApi {
    @Autowired
    private BusinessDeptService businessDeptService;
    @Autowired
    private Mapper dozerMapper;

    @Override
    public List<BusinessDeptEntity> deptList(@RequestBody BusinessDeptEntity businessdeptEntity) {
        QueryWrapper<BusinessDeptDO> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(businessdeptEntity.getDeptcode() != null, "deptcode", businessdeptEntity.getDeptcode());
        List<BusinessDeptDO> businessDeptDOList = businessDeptService.list(queryWrapper);
        return dozerMapper.map(businessDeptDOList, List.class);
    }
}
