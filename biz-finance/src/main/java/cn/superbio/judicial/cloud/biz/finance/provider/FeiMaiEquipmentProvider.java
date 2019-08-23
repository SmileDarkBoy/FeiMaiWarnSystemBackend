package cn.superbio.judicial.cloud.biz.finance.provider;

import cn.superbio.judicial.cloud.biz.finance.DO.FeiMaiEquipmentDO;
import cn.superbio.judicial.cloud.biz.finance.FeiMaiEquipmentServiceApi;
import cn.superbio.judicial.cloud.biz.finance.entity.FeiMaiEquipmentEntity;
import cn.superbio.judicial.cloud.biz.finance.service.FeiMaiEquipmentService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FeiMaiEquipmentProvider implements FeiMaiEquipmentServiceApi {
    @Autowired
    private FeiMaiEquipmentService feiMaiEquipmentService;
    @Autowired
    private Mapper dozerMapper;


    @Override
    public List<FeiMaiEquipmentEntity> equipmentList(@RequestBody FeiMaiEquipmentEntity feiMaiEquipmentEntity) {
        QueryWrapper<FeiMaiEquipmentDO> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(feiMaiEquipmentEntity.getId() != null, "id", feiMaiEquipmentEntity.getId())
                .eq(feiMaiEquipmentEntity.geteId() != null, "e_id", feiMaiEquipmentEntity.geteId())
                .eq(feiMaiEquipmentEntity.geteSeriesid() != null, "e_seriesid", feiMaiEquipmentEntity.geteSeriesid())
                .eq(feiMaiEquipmentEntity.getStatus() != null, "status", feiMaiEquipmentEntity.getStatus())
                .like(feiMaiEquipmentEntity.geteName() != null, "e_name", feiMaiEquipmentEntity.geteName())
                .like(feiMaiEquipmentEntity.geteParameter() != null, "e_parameter", feiMaiEquipmentEntity.geteParameter())
                .like(feiMaiEquipmentEntity.geteIntroduction() != null, "e_introduction", feiMaiEquipmentEntity.geteIntroduction())
                .like(feiMaiEquipmentEntity.getRemark() != null, "remark", feiMaiEquipmentEntity.getRemark());
        List<FeiMaiEquipmentDO> feiMaiEquipmentDOList = feiMaiEquipmentService.list(queryWrapper);
        return dozerMapper.map(feiMaiEquipmentDOList, List.class);
    }

    @Override
    public boolean save(@RequestBody FeiMaiEquipmentEntity feiMaiEquipmentEntity) {
        FeiMaiEquipmentDO feiMaiEquipmentDO = dozerMapper.map(feiMaiEquipmentEntity, FeiMaiEquipmentDO.class);
        return feiMaiEquipmentService.save(feiMaiEquipmentDO);
    }

    @Override
    public boolean update(@RequestBody FeiMaiEquipmentEntity feiMaiEquipmentEntity) {
        QueryWrapper<FeiMaiEquipmentDO> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", feiMaiEquipmentEntity.getId());
        FeiMaiEquipmentDO feiMaiEquipmentDO = dozerMapper.map(feiMaiEquipmentEntity, FeiMaiEquipmentDO.class);
        return feiMaiEquipmentService.update(feiMaiEquipmentDO, queryWrapper);
    }

    @Override
    public boolean remove(@RequestParam List<String> ids) {
        return feiMaiEquipmentService.removeByIds(ids);
    }

    @Override
    public boolean updateByIds(@RequestBody List<FeiMaiEquipmentEntity> feiMaiEquipmentEntity) {
        List<FeiMaiEquipmentDO> list = new ArrayList<>();
        for (FeiMaiEquipmentEntity temp : feiMaiEquipmentEntity) {
            list.add(dozerMapper.map(temp, FeiMaiEquipmentDO.class));
        }

        return feiMaiEquipmentService.updateBatchById(list);
    }
}
