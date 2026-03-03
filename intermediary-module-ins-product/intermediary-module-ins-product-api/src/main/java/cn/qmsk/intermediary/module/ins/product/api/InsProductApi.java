package cn.qmsk.intermediary.module.ins.product.api;

import cn.qmsk.intermediary.module.ins.product.enums.ApiConstants;

/**
 * 保险产品中台 Feign 接口
 */
@org.springframework.cloud.openfeign.FeignClient(name = ApiConstants.NAME)
public interface InsProductApi {
}
