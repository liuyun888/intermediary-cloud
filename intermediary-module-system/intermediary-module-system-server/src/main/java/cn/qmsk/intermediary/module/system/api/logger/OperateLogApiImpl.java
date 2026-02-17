package cn.qmsk.intermediary.module.system.api.logger;

import cn.qmsk.intermediary.framework.common.biz.system.logger.dto.OperateLogCreateReqDTO;
import cn.qmsk.intermediary.framework.common.pojo.CommonResult;
import cn.qmsk.intermediary.framework.common.pojo.PageResult;
import cn.qmsk.intermediary.framework.common.util.object.BeanUtils;
import cn.qmsk.intermediary.module.system.api.logger.dto.OperateLogPageReqDTO;
import cn.qmsk.intermediary.module.system.api.logger.dto.OperateLogRespDTO;
import cn.qmsk.intermediary.module.system.dal.dataobject.logger.OperateLogDO;
import cn.qmsk.intermediary.module.system.service.logger.OperateLogService;
import org.springframework.context.annotation.Primary;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import static cn.qmsk.intermediary.framework.common.pojo.CommonResult.success;

@RestController // 提供 RESTful API 接口，给 Feign 调用
@Validated
@Primary // 由于 OperateLogCommonApi 的存在，必须声明为 @Primary Bean
public class OperateLogApiImpl implements OperateLogApi {

    @Resource
    private OperateLogService operateLogService;

    @Override
    public CommonResult<Boolean> createOperateLog(OperateLogCreateReqDTO createReqDTO) {
        operateLogService.createOperateLog(createReqDTO);
        return success(true);
    }

    @Override
    public CommonResult<PageResult<OperateLogRespDTO>> getOperateLogPage(OperateLogPageReqDTO pageReqDTO) {
        PageResult<OperateLogDO> operateLogPage = operateLogService.getOperateLogPage(pageReqDTO);
        return success(BeanUtils.toBean(operateLogPage, OperateLogRespDTO.class));
    }

}
