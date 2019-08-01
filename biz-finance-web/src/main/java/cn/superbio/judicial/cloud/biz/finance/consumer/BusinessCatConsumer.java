package cn.superbio.judicial.cloud.biz.finance.consumer;

import cn.superbio.judicial.cloud.biz.finance.BusinessCatServiceApi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;

@FeignClient("BIZ-FINANCE")
@Service
public interface BusinessCatConsumer extends BusinessCatServiceApi {
}
