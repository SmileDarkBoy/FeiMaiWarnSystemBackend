package cn.superbio.judicial.cloud.biz.finance.service.impl;

import cn.superbio.judicial.cloud.biz.finance.DO.BusinessProductDO;
import cn.superbio.judicial.cloud.biz.finance.mapper.BusinessProductMapper;
import cn.superbio.judicial.cloud.biz.finance.service.BusinessProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BusinessProductServiceImpl extends ServiceImpl<BusinessProductMapper, BusinessProductDO> implements BusinessProductService {
    @Resource
    private BusinessProductMapper businessProductMapper;

    @Override
    public List<String> getDept() {
        return businessProductMapper.getDept();
    }
}
