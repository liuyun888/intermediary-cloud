package cn.qmsk.intermediary.module.pay.api.transfer;

import cn.qmsk.intermediary.framework.common.pojo.CommonResult;
import cn.qmsk.intermediary.framework.common.util.object.BeanUtils;
import cn.qmsk.intermediary.module.pay.api.transfer.dto.PayTransferCreateReqDTO;
import cn.qmsk.intermediary.module.pay.api.transfer.dto.PayTransferCreateRespDTO;
import cn.qmsk.intermediary.module.pay.api.transfer.dto.PayTransferRespDTO;
import cn.qmsk.intermediary.module.pay.dal.dataobject.channel.PayChannelDO;
import cn.qmsk.intermediary.module.pay.dal.dataobject.transfer.PayTransferDO;
import cn.qmsk.intermediary.module.pay.framework.pay.core.client.impl.weixin.WxPayClientConfig;
import cn.qmsk.intermediary.module.pay.service.channel.PayChannelService;
import cn.qmsk.intermediary.module.pay.service.transfer.PayTransferService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import static cn.qmsk.intermediary.framework.common.pojo.CommonResult.success;

/**
 * 转账单 API 实现类
 *
 * @author jason
 */
@RestController // 提供 RESTful API 接口，给 Feign 调用
@Validated
public class PayTransferApiImpl implements PayTransferApi {

    @Resource
    private PayTransferService payTransferService;
    @Resource
    private PayChannelService payChannelService;

    @Override
    public CommonResult<PayTransferCreateRespDTO> createTransfer(PayTransferCreateReqDTO reqDTO) {
        return success(payTransferService.createTransfer(reqDTO));
    }

    @Override
    public CommonResult<PayTransferRespDTO> getTransfer(Long id) {
        PayTransferDO transfer = payTransferService.getTransfer(id);
        if (transfer == null) {
            return null;
        }
        PayChannelDO channel = payChannelService.getChannel(transfer.getChannelId());
        String mchId = null;
        if (channel != null && channel.getConfig() instanceof WxPayClientConfig) {
            mchId = ((WxPayClientConfig) channel.getConfig()).getMchId();
        }
        return success(BeanUtils.toBean(transfer, PayTransferRespDTO.class).setChannelMchId(mchId));
    }

}
