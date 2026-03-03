package cn.qmsk.intermediary.module.ins.product.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 保险产品 DTO（Feign 入参/出参）
 */
@Data
public class InsProductDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String productName;
}
