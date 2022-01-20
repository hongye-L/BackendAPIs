package APIsOfMyBatis.dao;

import APIsOfMyBatis.entity.Comments;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * The interface Comment mapper.
 */
@Mapper
public interface CommentMapper {
    /**
     * Gets comments by id.
     *
     * @param commentId the comment id
     * @param tablename the tablename
     * @param postId    the post id
     * @return the comments by id
     */
    Comments getCommentsById(@Param("user_id")String commentId,@Param("tablename")String tablename,@Param("post_id")String postId);

    /**
     * Gets comments by post.
     *
     * @param postId    the post id
     * @param tablename the tablename
     * @return the comments by post
     */
    List<Comments> getCommentsByPost(@Param("post_id")String postId, @Param("tablename")String tablename);

    /**
     * Add comment boolean.
     *
     * @param nickname  the nickname
     * @param userId    the user id
     * @param postId    the post id
     * @param content   the content
     * @param tablename the tablename
     * @return the boolean
     */
    boolean addComment(@Param("nickname")String nickname,@Param("userid")String userId,@Param("post_id")String postId,
                       @Param("content")String content,@Param("tablename")String tablename);

    /**
     * Delete comment boolean.
     *
     * @param postId    the post id
     * @param commentId the comment id
     * @param userId    the user id
     * @param tablename the tablename
     * @return the boolean
     */
    boolean deleteComment(@Param("post_id")String postId,@Param("comment_id")String commentId,
                          @Param("user_id")String userId,@Param("tablename")String tablename);

}
