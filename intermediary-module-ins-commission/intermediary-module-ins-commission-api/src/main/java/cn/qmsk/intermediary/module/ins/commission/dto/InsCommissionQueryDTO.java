package cn.qmsk.intermediary.module.ins.commission.dto;

import lombok.Data;
import java.io.Serializable;

@Data
public class InsCommissionQueryDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long agentId;
    private String settleMonth;
}
