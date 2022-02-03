package com.hongye.APIsOfMyBatis.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.io.Serializable;

/**
 * (Reply)实体类
 *
 * @author makejava
 * @since 2022-01-22 13:09:07
 */
@Data
public class Reply implements Serializable {
    private static final long serialVersionUID = -53609167167085287L;
    
    private Integer replyId;
    
    private String userid;
    
    private String content;
    
    private Date time;
    
    private Integer parentId;
    
    private Integer commentId;

    private Integer postId;

}