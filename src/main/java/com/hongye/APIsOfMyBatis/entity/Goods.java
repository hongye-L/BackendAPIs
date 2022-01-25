package com.hongye.APIsOfMyBatis.entity;

import java.io.Serializable;

/**
 * (Goods)实体类
 *
 * @author makejava
 * @since 2022 -01-25 12:20:46
 */
public class Goods implements Serializable {
    private static final long serialVersionUID = 939149511417226181L;
    
    private Integer userId;

    private Integer id;

    private Boolean goods;


    /**
     * Gets user id.
     *
     * @return the user id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Gets goods.
     *
     * @return the goods
     */
    public Boolean getGoods() {
        return goods;
    }

    /**
     * Sets goods.
     *
     * @param goods the goods
     */
    public void setGoods(Boolean goods) {
        this.goods = goods;
    }

}