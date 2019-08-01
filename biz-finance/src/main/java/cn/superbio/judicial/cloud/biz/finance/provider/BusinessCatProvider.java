package cn.superbio.judicial.cloud.biz.finance.provider;

import cn.superbio.judicial.cloud.biz.finance.BusinessCatServiceApi;
import cn.superbio.judicial.cloud.biz.finance.DO.BusinessCatDO;
import cn.superbio.judicial.cloud.biz.finance.entity.BusinessCatEntity;
import cn.superbio.judicial.cloud.biz.finance.service.BusinessCatService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//@Service
@RestController
public class BusinessCatProvider implements BusinessCatServiceApi {
    @Autowired
    private BusinessCatService businessCatService;
    @Autowired
    private Mapper dozerMapper;


    @Override
    public List<BusinessCatEntity> catList(@RequestBody BusinessCatEntity businessCatEntity) {
        QueryWrapper<BusinessCatDO> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(businessCatEntity.getId() != null, "id", businessCatEntity.getId())
                .like(businessCatEntity.getName() != null, "name", businessCatEntity.getName())
                .eq(businessCatEntity.getgType() != null, "g_type", businessCatEntity.getgType())
                .eq(businessCatEntity.getState() != null, "state", businessCatEntity.getState());
        List<BusinessCatDO> BusinessCatDOList = businessCatService.list(queryWrapper);
        return dozerMapper.map(BusinessCatDOList, List.class);
    }

    @Override
    public boolean save(@RequestBody BusinessCatEntity businessCatEntity) {
        BusinessCatDO businessCatDO = dozerMapper.map(businessCatEntity, BusinessCatDO.class);
        return businessCatService.save(businessCatDO);
    }

    @Override
    public boolean update(@RequestBody BusinessCatEntity businessCatEntity) {
        QueryWrapper<BusinessCatDO> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", businessCatEntity.getId());
        BusinessCatDO businessCatDO = dozerMapper.map(businessCatEntity, BusinessCatDO.class);
        return businessCatService.update(businessCatDO, queryWrapper);
    }

    @Override
    public boolean remove(@RequestParam List<String> ids) {
        return businessCatService.removeByIds(ids);
    }

    @Override
    public boolean updateByIds(@RequestBody List<BusinessCatEntity> businessCatEntitys) {
        List<BusinessCatDO> list = new ArrayList<>();
        for (BusinessCatEntity temp : businessCatEntitys) {
            list.add(dozerMapper.map(temp, BusinessCatDO.class));
        }
        return businessCatService.updateBatchById(list);
    }
}
