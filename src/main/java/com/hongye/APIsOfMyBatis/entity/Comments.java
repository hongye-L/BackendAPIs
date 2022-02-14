package com.hongye.APIsOfMyBatis.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (CommentArts)实体类
 *
 * @author makejava
 * @since 2022 -01-20 11:21:49
 */
@Data
public class Comments implements Serializable {
    private static final long serialVersionUID = 965875710241774367L;

    
    private String userid;
    
    private String post_id;
    
    private String comment_id;
    
    private String content;
    
    private String goods;
    
    private Date time;
}