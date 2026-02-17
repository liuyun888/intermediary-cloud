package cn.qmsk.intermediary.module.promotion.api.bargain;

import cn.qmsk.intermediary.framework.common.pojo.CommonResult;
import cn.qmsk.intermediary.module.promotion.service.bargain.BargainActivityService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import static cn.qmsk.intermediary.framework.common.pojo.CommonResult.success;

/**
 * 砍价活动 Api 接口实现类
 *
 * @author HUIHUI
 */
@RestController // 提供 RESTful API 接口，给 Feign 调用
@Validated
public class BargainActivityApiImpl implements BargainActivityApi {

    @Resource
    private BargainActivityService bargainActivityService;

    @Override
    public CommonResult<Boolean> updateBargainActivityStock(Long id, Integer count) {
        bargainActivityService.updateBargainActivityStock(id, count);
        return success(true);
    }

}
