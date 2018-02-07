package com.imooc.sell2.enums;

import lombok.Getter;

/**
 * @author hushangkun
 * @date 2018/2/7 14:46
 */
@Getter
public enum ProductStatusEnum {
    UP(0,"在架"),
    DOWN(1,"下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
