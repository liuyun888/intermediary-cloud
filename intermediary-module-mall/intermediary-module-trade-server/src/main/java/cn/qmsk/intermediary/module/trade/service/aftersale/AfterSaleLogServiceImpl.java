package cn.qmsk.intermediary.module.trade.service.aftersale;

import cn.qmsk.intermediary.module.trade.convert.aftersale.AfterSaleLogConvert;
import cn.qmsk.intermediary.module.trade.dal.dataobject.aftersale.AfterSaleLogDO;
import cn.qmsk.intermediary.module.trade.dal.mysql.aftersale.AfterSaleLogMapper;
import cn.qmsk.intermediary.module.trade.service.aftersale.bo.AfterSaleLogCreateReqBO;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.annotation.Resource;
import java.util.List;

/**
 * 交易售后日志 Service 实现类
 *
 * @author 芋道源码
 */
@Service
@Validated
public class AfterSaleLogServiceImpl implements AfterSaleLogService {

    @Resource
    private AfterSaleLogMapper afterSaleLogMapper;

    @Override
    public void createAfterSaleLog(AfterSaleLogCreateReqBO createReqBO) {
        AfterSaleLogDO afterSaleLog = AfterSaleLogConvert.INSTANCE.convert(createReqBO);
        afterSaleLogMapper.insert(afterSaleLog);
    }

    @Override
    public List<AfterSaleLogDO> getAfterSaleLogList(Long afterSaleId) {
        return afterSaleLogMapper.selectListByAfterSaleId(afterSaleId);
    }

}
