package cn.qmsk.intermediary.module.ins.quote.dto;

import lombok.Data;
import java.io.Serializable;

@Data
public class InsQuoteResultDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String quoteNo;
    private Object premium;
}
