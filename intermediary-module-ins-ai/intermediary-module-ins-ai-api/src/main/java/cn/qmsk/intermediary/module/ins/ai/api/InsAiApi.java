package cn.qmsk.intermediary.module.ins.ai.api;

import cn.qmsk.intermediary.module.ins.ai.enums.ApiConstants;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = ApiConstants.NAME)
public interface InsAiApi {
}
