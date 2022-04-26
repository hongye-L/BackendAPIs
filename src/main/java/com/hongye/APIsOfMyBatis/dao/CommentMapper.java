package com.hongye.APIsOfMyBatis.dao;

import com.hongye.APIsOfMyBatis.entity.Comments;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * The interface Comment mapper.
 *
 * @author 竑也
 */
@Mapper
public interface CommentMapper {
    /**
     * Gets comments by id.
     *
     * @param comment_id the comment id
     * @param tablename  the tablename
     * @return the comments by id
     */
    Comments getCommentsById(@Param("comment_id")String comment_id,@Param("tablename")String tablename);

    /**
     * Gets comments by post.
     *
     * @param post_id   the post id
     * @param tablename the tablename
     * @return the comments by post
     */
    List<Comments> getCommentsByPost(@Param("post_id")String post_id, @Param("tablename")String tablename);

    /**
     * Add comment boolean.
     *
     * @param user_id   the user id
     * @param post_id   the post id
     * @param content   the content
     * @param tablename the tablename
     */
    void addComment(@Param("user_id")String user_id,@Param("post_id")String post_id,
                       @Param("content")String content,@Param("tablename")String tablename);

    /**
     * Delete comment boolean.
     *
     * @param post_id    the post id
     * @param comment_id the comment id
     * @param user_id    the user id
     * @param tablename  the tablename
     */
    void deleteComment(@Param("post_id")String post_id,@Param("comment_id")String comment_id,
                          @Param("user_id")String user_id,@Param("tablename")String tablename);

    /**
     * Check comments.
     *
     * @param tablename the tablename
     * @param content   the content
     * @return the comments
     */
    Comments check(@Param("tablename")String tablename,@Param("content")String content);

    /**
     * Gets comment id.
     *
     * @param user_id   the user id
     * @param content   the content
     * @param tablename the tablename
     * @return the comment id
     */
    String getCommentID(@Param("user_id")String user_id,@Param("content")String content,@Param("tablename")String tablename);

    /**
     * Gets comments by uid.
     *
     * @param user_id   the user id
     * @param tablename the tablename
     * @return the comments by uid
     */
    List<Comments> getCommentsByUID(@Param("user_id")String user_id,@Param("tablename")String tablename);
}
