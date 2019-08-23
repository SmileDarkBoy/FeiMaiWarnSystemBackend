package cn.superbio.judicial.cloud.biz.finance.provider;

import cn.superbio.judicial.cloud.biz.finance.DO.FeiMaiProjectDO;
import cn.superbio.judicial.cloud.biz.finance.FeiMaiProjectServiceApi;
import cn.superbio.judicial.cloud.biz.finance.entity.FeiMaiProjectEntity;
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
public class FeiMaiProjectProvider implements FeiMaiProjectServiceApi {
    @Autowired
    private FeiMaiProjectService feiMaiProjectService;
    @Autowired
    private Mapper dozerMapper;

    @Override
    public List<FeiMaiProjectEntity> projectList(@RequestBody FeiMaiProjectEntity feiMaiProjectEntity) {
        QueryWrapper<FeiMaiProjectDO> queryWrapper = new QueryWrapper<>();
        if (feiMaiProjectEntity.getProjectDate() != null) {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date now = feiMaiProjectEntity.getProjectDate();
            String time = format.format(now);
            queryWrapper.like(feiMaiProjectEntity.getProjectDate() != null, "project_date", time);
        }
        queryWrapper.eq(feiMaiProjectEntity.getId() != null, "id", feiMaiProjectEntity.getId())
                .eq(feiMaiProjectEntity.getProjectNo() != null, "project_no", feiMaiProjectEntity.getProjectNo())
                .eq(feiMaiProjectEntity.getProjectState() != null, "project_state", feiMaiProjectEntity.getProjectState())
                .eq(feiMaiProjectEntity.getStatus() != null, "status", feiMaiProjectEntity.getStatus())
                .like(feiMaiProjectEntity.getProjectName() != null, "project_name", feiMaiProjectEntity.getProjectName())
                .like(feiMaiProjectEntity.getProjectType() != null, "project_type", feiMaiProjectEntity.getProjectType())
                .like(feiMaiProjectEntity.getProjectArea() != null, "project_area", feiMaiProjectEntity.getProjectArea())
                .like(feiMaiProjectEntity.getProjectAddress() != null, "project_address", feiMaiProjectEntity.getProjectAddress())
                .like(feiMaiProjectEntity.getProjectDuration() != null, "project_duration", feiMaiProjectEntity.getProjectDuration())
                .like(feiMaiProjectEntity.getProjectLeader() != null, "project_leader", feiMaiProjectEntity.getProjectLeader())
                .like(feiMaiProjectEntity.getRemark() != null, "remark", feiMaiProjectEntity.getRemark());
        List<FeiMaiProjectDO> feiMaiProjectDOList = feiMaiProjectService.list(queryWrapper);
        return dozerMapper.map(feiMaiProjectDOList, List.class);
    }

    @Override
    public boolean save(@RequestBody FeiMaiProjectEntity feiMaiProjectEntity) {
        FeiMaiProjectDO feiMaiProjectDO = dozerMapper.map(feiMaiProjectEntity, FeiMaiProjectDO.class);
        return feiMaiProjectService.save(feiMaiProjectDO);
    }

    @Override
    public boolean update(@RequestBody FeiMaiProjectEntity feiMaiProjectEntity) {
        QueryWrapper<FeiMaiProjectDO> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", feiMaiProjectEntity.getId());
        FeiMaiProjectDO feiMaiProjectDO = dozerMapper.map(feiMaiProjectEntity, FeiMaiProjectDO.class);
        return feiMaiProjectService.update(feiMaiProjectDO, queryWrapper);
    }

    @Override
    public boolean remove(@RequestParam List<String> ids) {
        return feiMaiProjectService.removeByIds(ids);
    }

    @Override
    public boolean updateByIds(@RequestBody List<FeiMaiProjectEntity> feiMaiProjectEntity) {
        List<FeiMaiProjectDO> list = new ArrayList<>();
        for (FeiMaiProjectEntity temp : feiMaiProjectEntity) {
            list.add(dozerMapper.map(temp, FeiMaiProjectDO.class));
        }
        return feiMaiProjectService.updateBatchById(list);
    }

//    @Override
//    public FeiMaiProjectEntity getOne(@RequestBody FeiMaiProjectEntity feiMaiProjectEntity) {
//
//        return dozerMapper.map(feiMaiProjectService.getById(feiMaiProjectEntity.getId()), FeiMaiProjectEntity.class);
//    }


    @Override
    public FeiMaiProjectEntity getOne(@RequestParam String ids) {
        return dozerMapper.map(feiMaiProjectService.getById(ids), FeiMaiProjectEntity.class);

    }
}
