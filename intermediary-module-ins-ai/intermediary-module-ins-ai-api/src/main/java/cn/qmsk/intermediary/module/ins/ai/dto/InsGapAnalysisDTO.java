package cn.qmsk.intermediary.module.ins.ai.dto;

import lombok.Data;
import java.io.Serializable;

@Data
public class InsGapAnalysisDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String userId;
    private String gapResult;
}
