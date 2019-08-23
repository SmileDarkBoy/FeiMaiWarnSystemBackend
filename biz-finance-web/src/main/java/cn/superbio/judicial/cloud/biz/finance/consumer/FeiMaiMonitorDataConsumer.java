package cn.superbio.judicial.cloud.biz.finance.consumer;

import cn.superbio.judicial.cloud.biz.finance.FeiMaiMonitorDataServiceApi;
import cn.superbio.judicial.cloud.biz.finance.FeiMaiProjectServiceApi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;

@FeignClient("BIZ-FINANCE")
@Service
public interface FeiMaiMonitorDataConsumer extends FeiMaiMonitorDataServiceApi {
        }
