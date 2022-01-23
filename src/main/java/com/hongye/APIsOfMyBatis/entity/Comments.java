package com.hongye.APIsOfMyBatis.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (CommentArts)实体类
 *
 * @author makejava
 * @since 2022 -01-20 11:21:49
 */
public class Comments implements Serializable {
    private static final long serialVersionUID = 965875710241774367L;
    
    private String nickname;
    
    private String userid;
    
    private Integer postId;
    
    private Integer commentId;
    
    private String content;
    
    private Integer goods;
    
    private Date time;


    /**
     * Gets nickname.
     *
     * @return the nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Sets nickname.
     *
     * @param nickname the nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * Gets userid.
     *
     * @return the userid
     */
    public String getUserid() {
        return userid;
    }

    /**
     * Sets userid.
     *
     * @param userid the userid
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * Gets post id.
     *
     * @return the post id
     */
    public Integer getPostId() {
        return postId;
    }

    /**
     * Sets post id.
     *
     * @param postId the post id
     */
    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    /**
     * Gets comment id.
     *
     * @return the comment id
     */
    public Integer getCommentId() {
        return commentId;
    }

    /**
     * Sets comment id.
     *
     * @param commentId the comment id
     */
    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Gets goods.
     *
     * @return the goods
     */
    public Integer getGoods() {
        return goods;
    }

    /**
     * Sets goods.
     *
     * @param goods the goods
     */
    public void setGoods(Integer goods) {
        this.goods = goods;
    }

    /**
     * Gets time.
     *
     * @return the time
     */
    public Date getTime() {
        return time;
    }

    /**
     * Sets time.
     *
     * @param time the time
     */
    public void setTime(Date time) {
        this.time = time;
    }

}