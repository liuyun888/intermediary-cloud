package cn.qmsk.intermediary.module.ins.finance.dto;

import lombok.Data;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class InsSettlementDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String settleNo;
    private BigDecimal amount;
}
