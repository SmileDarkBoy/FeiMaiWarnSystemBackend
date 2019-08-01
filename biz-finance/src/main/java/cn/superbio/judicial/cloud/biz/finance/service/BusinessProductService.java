package cn.superbio.judicial.cloud.biz.finance.service;

import cn.superbio.judicial.cloud.biz.finance.DO.BusinessProductDO;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface BusinessProductService extends IService<BusinessProductDO> {
    List<String> getDept();
}
