package cn.qmsk.intermediary.module.ins.life.api;

import cn.qmsk.intermediary.module.ins.life.enums.ApiConstants;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = ApiConstants.NAME)
public interface InsLifeApi {
}
