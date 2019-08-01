package cn.superbio.judicial.cloud.biz.finance.service.impl;

import cn.superbio.judicial.cloud.biz.finance.DO.BusinessUsersDO;
import cn.superbio.judicial.cloud.biz.finance.mapper.BusinessUsersMapper;
import cn.superbio.judicial.cloud.biz.finance.service.BusinessUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service

public class BusinessUsersServiceImpl extends ServiceImpl<BusinessUsersMapper, BusinessUsersDO> implements BusinessUsersService {
}
