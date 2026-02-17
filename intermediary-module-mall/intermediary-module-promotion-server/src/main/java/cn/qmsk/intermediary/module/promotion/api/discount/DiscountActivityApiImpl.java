package cn.qmsk.intermediary.module.promotion.api.discount;

import cn.qmsk.intermediary.framework.common.pojo.CommonResult;
import cn.qmsk.intermediary.framework.common.util.object.BeanUtils;
import cn.qmsk.intermediary.module.promotion.api.discount.dto.DiscountProductRespDTO;
import cn.qmsk.intermediary.module.promotion.dal.dataobject.discount.DiscountProductDO;
import cn.qmsk.intermediary.module.promotion.service.discount.DiscountActivityService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

import static cn.qmsk.intermediary.framework.common.pojo.CommonResult.success;

/**
 * 限时折扣 API 实现类
 *
 * @author 芋道源码
 */
@RestController // 提供 RESTful API 接口，给 Feign 调用
@Validated
public class DiscountActivityApiImpl implements DiscountActivityApi {

    @Resource
    private DiscountActivityService discountActivityService;

    @Override
    public CommonResult<List<DiscountProductRespDTO>> getMatchDiscountProductListBySkuIds(Collection<Long> skuIds) {
        List<DiscountProductDO> list = discountActivityService.getMatchDiscountProductListBySkuIds(skuIds);
        return success(BeanUtils.toBean(list, DiscountProductRespDTO.class));
    }

}
