package com.hongye.APIsOfMyBatis.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (Reply)实体类
 *
 * @author makejava
 * @since 2022-01-22 13:09:07
 */
@Data
public class Reply implements Serializable {
    private static final long serialVersionUID = -53609167167085287L;
    
    private Integer reply_id;
    
    private String userid;
    
    private String content;
    
    private Date time;
    
    private Integer parent_id;
    
    private Integer comment_id;

    private Integer post_id;

}