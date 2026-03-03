package cn.qmsk.intermediary.module.ins.finance.api;

import cn.qmsk.intermediary.module.ins.finance.enums.ApiConstants;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = ApiConstants.NAME)
public interface InsFinanceApi {
}
