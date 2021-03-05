package com.imooc.enums;

/**
 * 是否 枚举
 */
public enum YesOrNo {
    No(0,"否"),
    Yes(1,"是");
    public final Integer type;
    public final String value;

    YesOrNo(Integer type, String value) {
        this.type = type;
        this.value = value;
    }
}
