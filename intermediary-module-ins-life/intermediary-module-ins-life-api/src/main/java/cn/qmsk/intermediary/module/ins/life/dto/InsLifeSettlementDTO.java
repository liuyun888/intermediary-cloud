package cn.qmsk.intermediary.module.ins.life.dto;

import lombok.Data;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class InsLifeSettlementDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String policyNo;
    private BigDecimal premium;
}
