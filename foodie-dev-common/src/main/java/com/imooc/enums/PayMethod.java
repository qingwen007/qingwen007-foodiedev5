package com.imooc.enums;

/**
 * @Description: 支付方式 枚举
 */
public enum PayMethod {
    WEINXIN(0,"微信"),
    ALIPAY(1,"支付宝");
    public final Integer type;
    public final String value;

    PayMethod(Integer type, String value) {
        this.type = type;
        this.value = value;
    }
}
