package com.hongye.APIsOfMyBatis.service;

import com.hongye.APIsOfMyBatis.dao.CommentMapper;
import com.hongye.APIsOfMyBatis.entity.Comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * The type Comment service.
 *
 * @author 竑也
 */
@Service
public class CommentService {
    @Autowired
    private CommentMapper commentMapper;
    @Autowired
    private RedisTemplate redisTemplate;
    /**
     * Gets comments by id.
     *
     * @param comment_id the comment id
     * @param tablename  the tablename
     * @return the comments by id
     */
    public Comments getCommentsById(String comment_id, String tablename) {
        Comments comments=commentMapper.getCommentsById(comment_id,tablename);
        List<Comments> commentsList=null;
        //判断有没有缓存 一般来说都有
        if (redisTemplate.hasKey(comment_id)){
            redisTemplate.expire(comment_id,30,TimeUnit.DAYS);
        }
        comments= (Comments) redisTemplate.opsForValue().get(comment_id);
        return comments;
    }

    /**
     * Gets comments by post.
     *
     * @param post_id    the post id
     * @param tablename the tablename
     * @return the comments by post
     */
    public List<Comments> getCommentsByPost(String post_id, String tablename) {
        return commentMapper.getCommentsByPost(post_id,tablename);
    }

    /**
     * Add comment boolean.
     *
     * @param user_id    the user id
     * @param post_id    the post id
     * @param content   the content
     * @param tablename the tablename
     */
    public void addComment(String user_id, String post_id, String content, String tablename) {
        commentMapper.addComment(user_id,post_id,content,tablename);
        Comments comments=new Comments();
        //拿到评论ID
        String commentId=getCommentID(user_id, content, tablename);
        comments.setContent(content);
        comments.setPost_id(post_id);
        comments.setUserid(user_id);
        //写入Redis
        redisTemplate.opsForValue().set(commentId,comments,30, TimeUnit.DAYS);
    }

    /**
     * Delete comment boolean.
     *
     * @param post_id    the post id
     * @param comment_id the comment id
     * @param user_id    the user id
     * @param tablename the tablename
     */
    public void deleteComment(String post_id, String comment_id, String user_id, String tablename) {
        commentMapper.deleteComment(post_id,comment_id,user_id,tablename);
        redisTemplate.delete(comment_id);
    }
    public Comments check(String tablename,String content){
        return commentMapper.check(tablename,content);
    }
    public String getCommentID(String user_id,String content,String tablename){
        return commentMapper.getCommentID(user_id, content, tablename);
    }
}
