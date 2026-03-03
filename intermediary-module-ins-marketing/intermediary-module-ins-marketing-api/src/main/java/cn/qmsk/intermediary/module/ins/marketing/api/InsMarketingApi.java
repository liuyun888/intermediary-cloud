package cn.qmsk.intermediary.module.ins.marketing.api;

import cn.qmsk.intermediary.module.ins.marketing.enums.ApiConstants;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = ApiConstants.NAME)
public interface InsMarketingApi {
}
