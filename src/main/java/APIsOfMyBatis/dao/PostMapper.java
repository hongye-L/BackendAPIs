package APIsOfMyBatis.dao;

import APIsOfMyBatis.entity.Posts;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * The interface Post mapper.
 *
 * @author 竑也
 */
@Mapper
public interface PostMapper {
    /**
     * Gets post by id and tablename.
     *
     * @param post_id   the post id
     * @param tablename the tablename
     * @return the post by id and tablename
     */
    Posts getPostByIDAndTablename(@Param("post_id") Integer post_id, @Param("tablename") String tablename);

    /**
     * Gets all posts by tablename.
     *
     * @param tablename the tablename
     * @return the all posts by tablename
     */
    List<Posts> getAllPostsByTablename(@Param("tablename") String tablename);

    /**
     * Delete post boolean.
     *
     * @param post_id   the post id
     * @param tablename the tablename
     * @return the boolean
     */
    boolean deletePostByidAndTablename(@Param("post_id")Integer post_id,@Param("tablename")String tablename);

    /**
     * Post a post boolean.
     *
     * @param userid   the nickname
     * @param content     the content
     * @param post_title  the post title
     * @param picture_1   the picture 1
     * @param picture_2   the picture 2
     * @param picture_3   the picture 3
     * @param picture_4   the picture 4
     * @param picture_5   the picture 5
     * @param picture_6   the picture 6
     * @param videos      the videos
     * @param tablename   the tablename
     * @return the boolean
     */
    boolean postAPost(@Param("userid")String userid,@Param("content")String content,
                    @Param("post_title")String post_title, @Param("picture_1")String picture_1, @Param("picture_2")String picture_2, @Param("picture_3")String
    picture_3, @Param("picture_4")String picture_4, @Param("picture_5")String picture_5, @Param("picture_6")String picture_6, @Param("videos")String
    videos, @Param("tablename")String tablename);
    Posts searchForLastPost(@Param("tablename")String tablename);
}
