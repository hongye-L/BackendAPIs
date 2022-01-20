package APIsOfMyBatis.service;

import APIsOfMyBatis.dao.CommentMapper;
import APIsOfMyBatis.entity.Comments;
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
     * @param commentId the comment id
     * @param tablename the tablename
     * @param postId    the post id
     * @return the comments by id
     */
    public Comments getCommentsById(String commentId, String tablename, String postId) {
        return commentMapper.getCommentsById(commentId,tablename,postId);
    }

    /**
     * Gets comments by post.
     *
     * @param postId    the post id
     * @param tablename the tablename
     * @return the comments by post
     */
    public List<Comments> getCommentsByPost(String postId, String tablename) {
        return commentMapper.getCommentsByPost(postId,tablename);
    }

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
    public boolean addComment(String nickname, String userId, String postId, String content, String tablename) {
        return commentMapper.addComment(nickname,userId,postId,content,tablename);
    }

    /**
     * Delete comment boolean.
     *
     * @param postId    the post id
     * @param commentId the comment id
     * @param userId    the user id
     * @param tablename the tablename
     * @return the boolean
     */
    public boolean deleteComment(String postId, String commentId, String userId, String tablename) {
        return commentMapper.deleteComment(postId,commentId,userId,tablename);
    }
}
