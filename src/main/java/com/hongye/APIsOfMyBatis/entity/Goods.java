package com.hongye.APIsOfMyBatis.entity;

import java.io.Serializable;

/**
 * (Goods)实体类
 *
 * @author makejava
 * @since 2022-01-25 12:20:46
 */
public class Goods implements Serializable {
    private static final long serialVersionUID = 939149511417226181L;
    
    private Integer userId;

    private Integer id;

    private Boolean goods;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Boolean getGoods() {
        return goods;
    }

    public void setGoods(Boolean goods) {
        this.goods = goods;
    }

}