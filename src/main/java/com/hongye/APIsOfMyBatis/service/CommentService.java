package com.hongye.APIsOfMyBatis.service;

import com.hongye.APIsOfMyBatis.dao.CommentMapper;
import com.hongye.APIsOfMyBatis.entity.Comments;
import com.hongye.APIsOfMyBatis.entity.Posts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Comment service.
 *
 * @author 竑也
 */
@Service
public class CommentService {
    @Autowired
    private CommentMapper commentMapper;

    /**
     * Gets comments by id.
     *
     * @param comment_id the comment id
     * @param tablename  the tablename
     * @param post_id    the post id
     * @param user_id    the user id
     * @return the comments by id
     */
    public Comments getCommentsById(String comment_id, String tablename, String post_id,String user_id) {
        return commentMapper.getCommentsById(comment_id,tablename,post_id,user_id);
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
     * @param nickname  the nickname
     * @param user_id    the user id
     * @param post_id    the post id
     * @param content   the content
     * @param tablename the tablename
     */
    public void addComment(String nickname, String user_id, String post_id, String content, String tablename) {
        commentMapper.addComment(nickname,user_id,post_id,content,tablename);
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
    }
    public Comments check(String tablename,String content){
        return commentMapper.check(tablename,content);
    }
}
