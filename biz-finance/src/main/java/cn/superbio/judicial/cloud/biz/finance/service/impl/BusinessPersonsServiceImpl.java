package cn.superbio.judicial.cloud.biz.finance.service.impl;

import cn.superbio.judicial.cloud.biz.finance.DO.BusinessPersonsDO;
import cn.superbio.judicial.cloud.biz.finance.mapper.BusinessPersonsMapper;
import cn.superbio.judicial.cloud.biz.finance.service.BusinessPersonsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class BusinessPersonsServiceImpl extends ServiceImpl<BusinessPersonsMapper, BusinessPersonsDO> implements BusinessPersonsService {
}
