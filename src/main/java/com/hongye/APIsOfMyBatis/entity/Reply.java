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
    
    private String reply_id;
    
    private String userid;
    
    private String content;
    
    private Date time;

    private String parent_id;
    
    private String comment_id;

    private String post_id;

}