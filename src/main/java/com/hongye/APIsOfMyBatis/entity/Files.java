package com.hongye.APIsOfMyBatis.entity;

import lombok.Data;

import java.io.Serializable;
/**
 * (Files)实体类
 *
 * @author makejava
 * @since 2022-04-27 14:01:05
 */
@Data
public class Files implements Serializable {
    private static final long serialVersionUID = -60506690232455979L;
    
    private String userId;
    
    private String address;
    
    private String plate;

    private String targetId;
}