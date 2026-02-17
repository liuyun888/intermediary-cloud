package cn.qmsk.intermediary.module.infra.api.logger;

import cn.qmsk.intermediary.framework.common.biz.infra.logger.ApiErrorLogCommonApi;
import cn.qmsk.intermediary.framework.common.biz.infra.logger.dto.ApiErrorLogCreateReqDTO;
import cn.qmsk.intermediary.framework.common.pojo.CommonResult;
import cn.qmsk.intermediary.module.infra.service.logger.ApiErrorLogService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import static cn.qmsk.intermediary.framework.common.pojo.CommonResult.success;

@RestController // 提供 RESTful API 接口，给 Feign 调用
@Validated
public class ApiErrorLogApiImpl implements ApiErrorLogCommonApi {

    @Resource
    private ApiErrorLogService apiErrorLogService;

    @Override
    public CommonResult<Boolean> createApiErrorLog(ApiErrorLogCreateReqDTO createDTO) {
        apiErrorLogService.createApiErrorLog(createDTO);
        return success(true);
    }

}
