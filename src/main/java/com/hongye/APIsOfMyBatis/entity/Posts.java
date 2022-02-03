package com.hongye.APIsOfMyBatis.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.io.Serializable;

/**
 * (PostArts)实体类
 *
 * @author makejava
 * @since 2022-01-19 13:29:47
 */
@Data
public class Posts implements Serializable {
    private static final long serialVersionUID = 592866995341806585L;
    
    private Integer postId;
    
    private String userId;
    
    private String userAvatar;
    
    private Date time;
    
    private String postTitle;
    
    private String content;
    
    private String picture1;
    
    private String picture2;
    
    private String picture3;
    
    private String picture5;
    
    private String picture4;
    
    private String picture6;
    
    private Boolean goods;
    
    private Integer replys;
    
    private String videos;
}