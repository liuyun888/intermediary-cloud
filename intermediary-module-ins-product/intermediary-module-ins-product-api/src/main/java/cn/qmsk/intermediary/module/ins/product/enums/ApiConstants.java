package cn.qmsk.intermediary.module.ins.product.enums;

import cn.qmsk.intermediary.framework.common.enums.RpcConstants;

/**
 * 保险产品中台 API 常量
 */
public class ApiConstants {
    /** 服务名，与 spring.application.name 保持一致 */
    public static final String NAME = "ins-product-server";
    public static final String PREFIX = RpcConstants.RPC_API_PREFIX + "/ins/product";
    public static final String VERSION = "1.0.0";
}
