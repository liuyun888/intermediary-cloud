package cn.qmsk.intermediary.module.ins.quote.api;

import cn.qmsk.intermediary.module.ins.quote.enums.ApiConstants;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = ApiConstants.NAME)
public interface InsQuoteApi {
}
