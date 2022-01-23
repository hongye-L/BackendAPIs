package com.hongye.APIsOfMyBatis.dao;

import com.hongye.APIsOfMyBatis.entity.Reply;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * The interface Reply mapper.
 * @author 竑也
 */
@Mapper
public interface ReplyMapper {
    /**
     * Gets reply by id.
     *
     * @param user_id    the user id
     * @param comment_id the comment id
     * @param tablename the tablename
     * @return the reply by id
     */
    Reply getReplyById(@Param("user_id")String user_id,@Param("comment_id")String comment_id,@Param("tablename")String tablename);

    /**
     * Gets reply by comment id.
     *
     * @param comment_id the comment id
     * @param tablename the tablename
     * @return the reply by comment id
     */
    List<Reply> getReplyByCommentId(@Param("comment_id")String comment_id,@Param("tablename")String tablename);

    /**
     * Add comment boolean.
     *
     * @param user_id    the user id
     * @param content   the content
     * @param parentId  the parent id
     * @param commentId the comment id
     * @param postId    the post id
     * @param tablename the tablename
     * @return the boolean
     */
    boolean addReply(@Param("user_id")String user_id,@Param("content")String content,@Param("parent_id")String parentId,@Param("comment_id")String commentId
    ,@Param("post_id")String postId,@Param("tablename")String tablename);

    /**
     * Delete comment by id boolean.
     *
     * @param user_id  the user id
     * @param replyId the reply id
     * @return the boolean
     */
    boolean deleteCommentById(@Param("user_id")String user_id,@Param("reply_id")String replyId);
}
