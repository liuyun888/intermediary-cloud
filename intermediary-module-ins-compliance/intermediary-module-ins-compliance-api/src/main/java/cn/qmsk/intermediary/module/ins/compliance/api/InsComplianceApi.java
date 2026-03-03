package cn.qmsk.intermediary.module.ins.compliance.api;

import cn.qmsk.intermediary.module.ins.compliance.enums.ApiConstants;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = ApiConstants.NAME)
public interface InsComplianceApi {
}
