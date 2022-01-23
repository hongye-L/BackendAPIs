package com.hongye.APIsOfMyBatis.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Reply)实体类
 *
 * @author makejava
 * @since 2022-01-22 13:09:07
 */
public class Reply implements Serializable {
    private static final long serialVersionUID = -53609167167085287L;
    
    private Integer replyId;
    
    private String userid;
    
    private String content;
    
    private Date time;
    
    private Integer parentId;
    
    private Integer commentId;
    private Integer postId;

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }
}