package cn.qmsk.intermediary.module.ins.compliance.dto;

import lombok.Data;
import java.io.Serializable;

@Data
public class InsRecordingStatusDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String sessionId;
    private Integer status;
}
