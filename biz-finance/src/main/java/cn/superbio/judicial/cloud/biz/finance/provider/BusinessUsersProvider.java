package cn.superbio.judicial.cloud.biz.finance.provider;

import cn.superbio.judicial.cloud.biz.finance.BusinessUsersServiceApi;
import cn.superbio.judicial.cloud.biz.finance.DO.BusinessUsersDO;
import cn.superbio.judicial.cloud.biz.finance.entity.BusinessUsersEntity;
import cn.superbio.judicial.cloud.biz.finance.service.BusinessUsersService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Service
@RestController
public class BusinessUsersProvider implements BusinessUsersServiceApi {
    @Autowired
    private BusinessUsersService businessUsersService;
    @Autowired
    private Mapper dozerMapper;


    @Override
    public List<BusinessUsersEntity> usersList(@RequestBody BusinessUsersEntity businessUsersEntity) {
        QueryWrapper<BusinessUsersDO> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(businessUsersEntity.getWebchart() != null, "webchart", businessUsersEntity.getWebchart())
                .like(businessUsersEntity.getUsername() != null, "username", businessUsersEntity.getUsername());
        List<BusinessUsersDO> businessUsersDOList = businessUsersService.list(queryWrapper);
        return dozerMapper.map(businessUsersDOList, List.class);
    }
}
