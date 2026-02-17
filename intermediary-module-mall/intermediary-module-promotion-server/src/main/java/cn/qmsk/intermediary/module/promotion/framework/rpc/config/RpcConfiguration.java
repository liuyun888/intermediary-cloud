package cn.qmsk.intermediary.module.promotion.framework.rpc.config;

import cn.qmsk.intermediary.module.infra.api.websocket.WebSocketSenderApi;
import cn.qmsk.intermediary.module.member.api.user.MemberUserApi;
import cn.qmsk.intermediary.module.product.api.category.ProductCategoryApi;
import cn.qmsk.intermediary.module.product.api.sku.ProductSkuApi;
import cn.qmsk.intermediary.module.product.api.spu.ProductSpuApi;
import cn.qmsk.intermediary.module.system.api.social.SocialClientApi;
import cn.qmsk.intermediary.module.system.api.user.AdminUserApi;
import cn.qmsk.intermediary.module.trade.api.order.TradeOrderApi;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration(value = "promotionRpcConfiguration", proxyBeanMethods = false)
@EnableFeignClients(clients = {ProductSkuApi.class, ProductSpuApi.class, ProductCategoryApi.class,
        MemberUserApi.class, TradeOrderApi.class, AdminUserApi.class, SocialClientApi.class,
        WebSocketSenderApi.class})
public class RpcConfiguration {
}
