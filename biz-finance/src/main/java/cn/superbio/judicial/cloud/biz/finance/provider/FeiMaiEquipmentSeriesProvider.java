package cn.superbio.judicial.cloud.biz.finance.provider;

import cn.superbio.judicial.cloud.biz.finance.DO.FeiMaiEquipmentSeriesDO;
import cn.superbio.judicial.cloud.biz.finance.FeiMaiEquipmentSeriesServiceApi;
import cn.superbio.judicial.cloud.biz.finance.entity.FeiMaiEquipmentSeriesEntity;
import cn.superbio.judicial.cloud.biz.finance.service.FeiMaiEquipmentSeriesService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FeiMaiEquipmentSeriesProvider implements FeiMaiEquipmentSeriesServiceApi {
    @Autowired
    private FeiMaiEquipmentSeriesService feiMaiEquipmentSeriesService;
    @Autowired
    private Mapper dozerMapper;

    @Override
    public List<FeiMaiEquipmentSeriesEntity> equipmentList(@RequestBody FeiMaiEquipmentSeriesEntity feiMaiEquipmentSeriesEntity) {
        QueryWrapper<FeiMaiEquipmentSeriesDO> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(feiMaiEquipmentSeriesEntity.getId() != null, "id", feiMaiEquipmentSeriesEntity.getId())
                .eq(feiMaiEquipmentSeriesEntity.getsId() != null, "s_id", feiMaiEquipmentSeriesEntity.getsId())
                .eq(feiMaiEquipmentSeriesEntity.getStatus() != null, "status", feiMaiEquipmentSeriesEntity.getStatus())
                .like(feiMaiEquipmentSeriesEntity.getsName()!=null,"s_name",feiMaiEquipmentSeriesEntity.getsName())
                .like(feiMaiEquipmentSeriesEntity.getRemark()!=null,"remark",feiMaiEquipmentSeriesEntity.getRemark());
        List<FeiMaiEquipmentSeriesDO> feiMaiEquipmentSeriesDOList=feiMaiEquipmentSeriesService.list(queryWrapper);
        return dozerMapper.map(feiMaiEquipmentSeriesDOList,List.class);
    }

    @Override
    public boolean save(@RequestBody FeiMaiEquipmentSeriesEntity feiMaiEquipmentSeriesEntity) {
        FeiMaiEquipmentSeriesDO feiMaiEquipmentSeriesDO=dozerMapper.map(feiMaiEquipmentSeriesEntity,FeiMaiEquipmentSeriesDO.class);
        return feiMaiEquipmentSeriesService.save(feiMaiEquipmentSeriesDO);
    }

    @Override
    public boolean update(@RequestBody FeiMaiEquipmentSeriesEntity feiMaiEquipmentSeriesEntity) {
        QueryWrapper<FeiMaiEquipmentSeriesDO> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", feiMaiEquipmentSeriesEntity.getId());
        FeiMaiEquipmentSeriesDO feiMaiEquipmentSeriesDO = dozerMapper.map(feiMaiEquipmentSeriesEntity, FeiMaiEquipmentSeriesDO.class);
        return feiMaiEquipmentSeriesService.update(feiMaiEquipmentSeriesDO, queryWrapper);
    }

    @Override
    public boolean remove(@RequestParam List<String> ids) {
        return feiMaiEquipmentSeriesService.removeByIds(ids);
    }

    @Override
    public boolean updateByIds(@RequestBody List<FeiMaiEquipmentSeriesEntity> feiMaiEquipmentSeriesEntity) {
        List<FeiMaiEquipmentSeriesDO> list = new ArrayList<>();
        for (FeiMaiEquipmentSeriesEntity temp : feiMaiEquipmentSeriesEntity) {
            list.add(dozerMapper.map(temp, FeiMaiEquipmentSeriesDO.class));
        }
        return feiMaiEquipmentSeriesService.updateBatchById(list);
    }
}
