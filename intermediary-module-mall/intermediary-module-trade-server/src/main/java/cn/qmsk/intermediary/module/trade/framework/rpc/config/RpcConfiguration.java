package cn.qmsk.intermediary.module.trade.framework.rpc.config;

import cn.qmsk.intermediary.module.member.api.address.MemberAddressApi;
import cn.qmsk.intermediary.module.member.api.config.MemberConfigApi;
import cn.qmsk.intermediary.module.member.api.level.MemberLevelApi;
import cn.qmsk.intermediary.module.member.api.point.MemberPointApi;
import cn.qmsk.intermediary.module.member.api.user.MemberUserApi;
import cn.qmsk.intermediary.module.pay.api.order.PayOrderApi;
import cn.qmsk.intermediary.module.pay.api.refund.PayRefundApi;
import cn.qmsk.intermediary.module.pay.api.transfer.PayTransferApi;
import cn.qmsk.intermediary.module.pay.api.wallet.PayWalletApi;
import cn.qmsk.intermediary.module.product.api.category.ProductCategoryApi;
import cn.qmsk.intermediary.module.product.api.comment.ProductCommentApi;
import cn.qmsk.intermediary.module.product.api.sku.ProductSkuApi;
import cn.qmsk.intermediary.module.product.api.spu.ProductSpuApi;
import cn.qmsk.intermediary.module.promotion.api.bargain.BargainActivityApi;
import cn.qmsk.intermediary.module.promotion.api.bargain.BargainRecordApi;
import cn.qmsk.intermediary.module.promotion.api.combination.CombinationRecordApi;
import cn.qmsk.intermediary.module.promotion.api.coupon.CouponApi;
import cn.qmsk.intermediary.module.promotion.api.discount.DiscountActivityApi;
import cn.qmsk.intermediary.module.promotion.api.point.PointActivityApi;
import cn.qmsk.intermediary.module.promotion.api.reward.RewardActivityApi;
import cn.qmsk.intermediary.module.promotion.api.seckill.SeckillActivityApi;
import cn.qmsk.intermediary.module.system.api.notify.NotifyMessageSendApi;
import cn.qmsk.intermediary.module.system.api.social.SocialClientApi;
import cn.qmsk.intermediary.module.system.api.social.SocialUserApi;
import cn.qmsk.intermediary.module.system.api.user.AdminUserApi;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration(value = "tradeRpcConfiguration", proxyBeanMethods = false)
@EnableFeignClients(clients = {
        BargainActivityApi.class, BargainRecordApi.class, CombinationRecordApi.class,
        CouponApi.class, DiscountActivityApi.class, RewardActivityApi.class, SeckillActivityApi.class, PointActivityApi.class,
        MemberUserApi.class, MemberPointApi.class, MemberLevelApi.class, MemberAddressApi.class, MemberConfigApi.class,
        ProductSpuApi.class, ProductSkuApi.class, ProductCommentApi.class, ProductCategoryApi.class,
        PayOrderApi.class, PayRefundApi.class, PayTransferApi.class, PayWalletApi.class,
        AdminUserApi.class, NotifyMessageSendApi.class, SocialClientApi.class, SocialUserApi.class
})
public class RpcConfiguration {
}
