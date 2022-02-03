package com.hongye.APIsOfMyBatis.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * (Goods)实体类
 *
 * @author makejava
 * @since 2022 -01-25 12:20:46
 */
@Data
public class Goods implements Serializable {
    private static final long serialVersionUID = 939149511417226181L;
    
    private Integer userId;

    private Integer id;

    private Boolean goods;
}