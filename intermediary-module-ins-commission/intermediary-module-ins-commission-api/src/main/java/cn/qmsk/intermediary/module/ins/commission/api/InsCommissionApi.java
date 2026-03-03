package cn.qmsk.intermediary.module.ins.commission.api;

import cn.qmsk.intermediary.module.ins.commission.enums.ApiConstants;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = ApiConstants.NAME)
public interface InsCommissionApi {
}
