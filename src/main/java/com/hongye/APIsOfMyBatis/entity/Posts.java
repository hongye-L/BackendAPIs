package com.hongye.APIsOfMyBatis.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (PostArts)实体类
 *
 * @author makejava
 * @since 2022-01-19 13:29:47
 */
@Data
public class Posts implements Serializable {
    private static final long serialVersionUID = 592866995341806585L;
    
    private Integer post_id;
    
    private String userid;

    private Date time;
    
    private String post_title;
    
    private String content;
    
    private String picture_1;
    
    private String picture_2;
    
    private String picture_3;
    
    private String picture_4;
    
    private String picture_5;
    
    private String picture_6;
    
    private String goods;
    
    private String replys;
    
    private String videos;
}