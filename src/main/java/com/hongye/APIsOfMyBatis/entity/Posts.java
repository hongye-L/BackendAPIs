package com.hongye.APIsOfMyBatis.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (PostArts)实体类
 *
 * @author makejava
 * @since 2022-01-19 13:29:47
 */
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


    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getUserId() {
        return userId;
    }

    public void setNickname(String userId) {
        this.userId = userId;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPicture1() {
        return picture1;
    }

    public void setPicture1(String picture1) {
        this.picture1 = picture1;
    }

    public String getPicture2() {
        return picture2;
    }

    public void setPicture2(String picture2) {
        this.picture2 = picture2;
    }

    public String getPicture3() {
        return picture3;
    }

    public void setPicture3(String picture3) {
        this.picture3 = picture3;
    }

    public String getPicture5() {
        return picture5;
    }

    public void setPicture5(String picture5) {
        this.picture5 = picture5;
    }

    public String getPicture4() {
        return picture4;
    }

    public void setPicture4(String picture4) {
        this.picture4 = picture4;
    }

    public String getPicture6() {
        return picture6;
    }

    public void setPicture6(String picture6) {
        this.picture6 = picture6;
    }

    public Boolean getGoods() {
        return goods;
    }

    public void setGoods(Boolean goods) {
        this.goods = goods;
    }

    public Integer getReplys() {
        return replys;
    }

    public void setReplys(Integer replys) {
        this.replys = replys;
    }

    public String getVideos() {
        return videos;
    }

    public void setVideos(String videos) {
        this.videos = videos;
    }

}