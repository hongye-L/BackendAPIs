package com.hongye.APIsOfMyBatis.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.io.Serializable;

/**
 * (CommentArts)实体类
 *
 * @author makejava
 * @since 2022 -01-20 11:21:49
 */
@Getter
@Setter
public class Comments implements Serializable {
    private static final long serialVersionUID = 965875710241774367L;
    
    private String nickname;
    
    private String userid;
    
    private Integer postId;
    
    private Integer commentId;
    
    private String content;
    
    private Integer goods;
    
    private Date time;
}