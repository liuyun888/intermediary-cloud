package cn.qmsk.intermediary.module.ins.marketing.dto;

import lombok.Data;
import java.io.Serializable;

@Data
public class InsCouponCheckDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String couponCode;
    private Long userId;
}
