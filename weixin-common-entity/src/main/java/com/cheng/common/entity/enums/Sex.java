package com.cheng.common.entity.enums;

/**
 * Desc: 性别
 * Author: hp
 * Date: 2016/11/2
 */
public enum Sex {

    MAN("男士"),
    WOMAN("女士"),
    UNKNOW("未知");

    private String name;

    Sex(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
