package cn.qmsk.intermediary.module.product.api.sku;

import cn.qmsk.intermediary.framework.common.pojo.CommonResult;
import cn.qmsk.intermediary.framework.common.util.object.BeanUtils;
import cn.qmsk.intermediary.module.product.api.sku.dto.ProductSkuRespDTO;
import cn.qmsk.intermediary.module.product.api.sku.dto.ProductSkuUpdateStockReqDTO;
import cn.qmsk.intermediary.module.product.convert.sku.ProductSkuConvert;
import cn.qmsk.intermediary.module.product.dal.dataobject.sku.ProductSkuDO;
import cn.qmsk.intermediary.module.product.service.sku.ProductSkuService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

import static cn.qmsk.intermediary.framework.common.pojo.CommonResult.success;

/**
 * 商品 SKU API 实现类
 *
 * @author LeeYan9
 * @since 2022-09-06
 */
@RestController // 提供 RESTful API 接口，给 Feign 调用
@Validated
public class ProductSkuApiImpl implements ProductSkuApi {

    @Resource
    private ProductSkuService productSkuService;

    @Override
    public CommonResult<ProductSkuRespDTO> getSku(Long id) {
        ProductSkuDO sku = productSkuService.getSku(id);
        return success(BeanUtils.toBean(sku, ProductSkuRespDTO.class));
    }

    @Override
    public CommonResult<List<ProductSkuRespDTO>> getSkuList(Collection<Long> ids) {
        List<ProductSkuDO> skus = productSkuService.getSkuList(ids);
        return success(BeanUtils.toBean(skus, ProductSkuRespDTO.class));
    }

    @Override
    public CommonResult<List<ProductSkuRespDTO>> getSkuListBySpuId(Collection<Long> spuIds) {
        List<ProductSkuDO> skus = productSkuService.getSkuListBySpuId(spuIds);
        return success(BeanUtils.toBean(skus, ProductSkuRespDTO.class));
    }

    @Override
    public CommonResult<Boolean> updateSkuStock(ProductSkuUpdateStockReqDTO updateStockReqDTO) {
        productSkuService.updateSkuStock(updateStockReqDTO);
        return success(true);
    }

}
