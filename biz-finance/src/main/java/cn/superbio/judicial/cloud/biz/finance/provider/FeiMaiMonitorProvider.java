package cn.superbio.judicial.cloud.biz.finance.provider;

import cn.superbio.judicial.cloud.biz.finance.DO.FeiMaiMonitorDataDO;
import cn.superbio.judicial.cloud.biz.finance.DO.FeiMaiProjectDO;
import cn.superbio.judicial.cloud.biz.finance.FeiMaiMonitorDataServiceApi;
import cn.superbio.judicial.cloud.biz.finance.FeiMaiProjectServiceApi;
import cn.superbio.judicial.cloud.biz.finance.entity.FeiMaiMonitorDataEntity;
import cn.superbio.judicial.cloud.biz.finance.entity.FeiMaiProjectEntity;
import cn.superbio.judicial.cloud.biz.finance.service.FeiMaiMonitorService;
import cn.superbio.judicial.cloud.biz.finance.service.FeiMaiProjectService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class FeiMaiMonitorProvider implements FeiMaiMonitorDataServiceApi {
    @Autowired
    private FeiMaiMonitorService feiMaiMonitorService;
    @Autowired
    private Mapper dozerMapper;

    @Override
    public List<FeiMaiMonitorDataEntity> monitorList(@RequestBody FeiMaiMonitorDataEntity feiMaiMonitorDataEntity) {
        QueryWrapper<FeiMaiMonitorDataDO> queryWrapper = new QueryWrapper<>();
        if (feiMaiMonitorDataEntity.getMonitorTime() != null) {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date now = feiMaiMonitorDataEntity.getMonitorTime();
            String time = format.format(now);
            queryWrapper.like(feiMaiMonitorDataEntity.getMonitorTime() != null, "monitor_time", time);
        }
        queryWrapper.eq(feiMaiMonitorDataEntity.getId() != null, "id", feiMaiMonitorDataEntity.getId())
                .eq(feiMaiMonitorDataEntity.getProjectNo() != null, "project_no", feiMaiMonitorDataEntity.getProjectNo())
                .eq(feiMaiMonitorDataEntity.getStatus() != null, "status", feiMaiMonitorDataEntity.getStatus())
                .like(feiMaiMonitorDataEntity.getProjectName() != null, "project_name", feiMaiMonitorDataEntity.getProjectName())
                .like(feiMaiMonitorDataEntity.getElevation() != null, "elevationget", feiMaiMonitorDataEntity.getElevation())
                .like(feiMaiMonitorDataEntity.getDeformation() != null, "deformation", feiMaiMonitorDataEntity.getDeformation())
                .like(feiMaiMonitorDataEntity.getAccumulation() != null, "accumulation", feiMaiMonitorDataEntity.getAccumulation())
                .like(feiMaiMonitorDataEntity.getMonitorTime() != null, "monitor_program", feiMaiMonitorDataEntity.getMonitorTime())
                .like(feiMaiMonitorDataEntity.getEquipmentName() != null, "equipment_name", feiMaiMonitorDataEntity.getEquipmentName())
                .like(feiMaiMonitorDataEntity.getRemark() != null, "remark", feiMaiMonitorDataEntity.getRemark());
        List<FeiMaiMonitorDataDO> feiMaiMonitorDataList = feiMaiMonitorService.list(queryWrapper);
        return dozerMapper.map(feiMaiMonitorDataList, List.class);
    }

    @Override
    public boolean save(@RequestBody FeiMaiMonitorDataEntity feiMaiMonitorDataEntity) {
        FeiMaiMonitorDataDO feiMaiMonitorDataDO = dozerMapper.map(feiMaiMonitorDataEntity, FeiMaiMonitorDataDO.class);
        return feiMaiMonitorService.save(feiMaiMonitorDataDO);
    }

    @Override
    public boolean update(@RequestBody FeiMaiMonitorDataEntity feiMaiMonitorDataEntity) {
        QueryWrapper<FeiMaiMonitorDataDO> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", feiMaiMonitorDataEntity.getId());
        FeiMaiMonitorDataDO feiMaiMonitorDataDO = dozerMapper.map(feiMaiMonitorDataEntity, FeiMaiMonitorDataDO.class);
        return feiMaiMonitorService.update(feiMaiMonitorDataDO, queryWrapper);
    }

    @Override
    public boolean remove(@RequestParam List<String> ids) {
        return feiMaiMonitorService.removeByIds(ids);
    }

    @Override
    public boolean updateByIds(@RequestBody List<FeiMaiMonitorDataEntity> feiMaiMonitorDataEntity) {
        List<FeiMaiMonitorDataDO> list = new ArrayList<>();
        for (FeiMaiMonitorDataEntity temp : feiMaiMonitorDataEntity) {
            list.add(dozerMapper.map(temp, FeiMaiMonitorDataDO.class));
        }
        return feiMaiMonitorService.updateBatchById(list);
    }

    @Override
    public FeiMaiMonitorDataEntity getOne(@RequestParam String ids) {
        return dozerMapper.map(feiMaiMonitorService.getById(ids), FeiMaiMonitorDataEntity.class);
    }
}
