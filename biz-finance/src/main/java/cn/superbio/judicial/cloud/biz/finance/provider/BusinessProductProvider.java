package cn.superbio.judicial.cloud.biz.finance.provider;

import cn.superbio.judicial.cloud.biz.finance.BusinessProductServiceApi;
import cn.superbio.judicial.cloud.biz.finance.DO.BusinessProductDO;
import cn.superbio.judicial.cloud.biz.finance.entity.BusinessProductEntity;
import cn.superbio.judicial.cloud.biz.finance.service.BusinessProductService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

//@Service
@RestController
public class BusinessProductProvider implements BusinessProductServiceApi {
    @Autowired
    private BusinessProductService businessProductService;
    @Autowired
    private Mapper dozerMapper;


    @Override
    public List<BusinessProductEntity> productList(@RequestBody BusinessProductEntity businessProductEntity) {
        QueryWrapper<BusinessProductDO> queryWrapper = new QueryWrapper<>();
        if (businessProductEntity.getStartTime() != null) {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date Time = businessProductEntity.getStartTime();
            Date Time1 = businessProductEntity.getEndTime();
            String startTime = format.format(Time);
            String endTime = format.format(Time1);
            System.out.println(startTime + endTime);
            queryWrapper.between("crt_time", startTime, endTime);
        }
        if (businessProductEntity.getCrtTime() != null) {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date now = businessProductEntity.getCrtTime();
            String time = format.format(now);
            queryWrapper.like(businessProductEntity.getCrtTime() != null, "crt_time", time);
        }
        queryWrapper.eq(businessProductEntity.getPid() != null, "pid", businessProductEntity.getPid())
                .eq(businessProductEntity.getCatId() != null, "cat_id", businessProductEntity.getCatId())
                .eq(businessProductEntity.getBusinessType() != null, "business_type", businessProductEntity.getBusinessType())
                .like(businessProductEntity.getDeptname() != null, "deptname", businessProductEntity.getDeptname());
        List<BusinessProductDO> BusinessProductDOList = businessProductService.list(queryWrapper.orderByDesc("crt_time"));
        return dozerMapper.map(BusinessProductDOList, List.class);
    }

    @Override
    public List<String> deptList() {
        return businessProductService.getDept();
    }
}
