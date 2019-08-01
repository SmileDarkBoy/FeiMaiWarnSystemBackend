package cn.superbio.judicial.cloud.biz.finance.service.impl;


import cn.superbio.judicial.cloud.biz.finance.DO.BusinessDeptDO;
import cn.superbio.judicial.cloud.biz.finance.mapper.BusinessDeptMapper;
import cn.superbio.judicial.cloud.biz.finance.service.BusinessDeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class BusinessDeptServiceImpl extends ServiceImpl<BusinessDeptMapper, BusinessDeptDO> implements BusinessDeptService {
}
