package cn.superbio.judicial.cloud.biz.finance.mapper;

import cn.superbio.judicial.cloud.biz.finance.DO.BusinessProductDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BusinessProductMapper extends BaseMapper<BusinessProductDO> {
    @Select("select  distinct(deptname) from business_daily_product_info;")
    List<String> getDept();
}
