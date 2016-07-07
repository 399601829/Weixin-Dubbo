package com.cheng.weixin.rpc.user.entity;

import com.cheng.common.entity.DataEntity;

/**
 * Desc: 城市
 * Author: cheng
 * Date: 2016/6/3
 */
public class City extends DataEntity<City> {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
