package cn.superbio.judicial.cloud.biz.finance.service.impl;

import cn.superbio.judicial.cloud.biz.finance.DO.BusinessCatDO;
import cn.superbio.judicial.cloud.biz.finance.mapper.BusinessCatMapper;
import cn.superbio.judicial.cloud.biz.finance.service.BusinessCatService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class BusinessCatServiceImpl extends ServiceImpl<BusinessCatMapper, BusinessCatDO> implements BusinessCatService {
}
