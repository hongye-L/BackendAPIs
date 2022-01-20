package APIsOfMyBatis.service;

import APIsOfMyBatis.dao.PostMapper;
import APIsOfMyBatis.entity.Posts;
import APIsOfMyBatis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.awt.*;
import java.util.List;

/**
 * The type Post service.
 *
 * @author 竑也
 */
@Service
public class PostService{
    @Autowired
    private PostMapper postMapper;

    /**
     * Gets post by id and tablename.
     *
     * @param post_id   the post id
     * @param tablename the tablename
     * @return the post by id and tablename
     */
    public Posts getPostByIDAndTablename(Integer post_id, String tablename) {
        return postMapper.getPostByIDAndTablename(post_id,tablename);
    }

    /**
     * Gets all posts by tablename.
     *
     * @param tablename the tablename
     * @return the all posts by tablename
     */
    public List<Posts> getAllPostsByTablename(String tablename) {
        return postMapper.getAllPostsByTablename(tablename);
    }

    /**
     * Delete post byid and tablename boolean.
     *
     * @param post_id   the post id
     * @param tablename the tablename
     * @return the boolean
     */
    public boolean deletePostByidAndTablename(Integer post_id, String tablename) {
        return postMapper.deletePostByidAndTablename(post_id,tablename);
    }

    /**
     * Post a post boolean.
     *
     * @param nickname   the nickname
     * @param content    the content
     * @param post_title the post title
     * @param picture_1  the picture 1
     * @param picture_2  the picture 2
     * @param picture_3  the picture 3
     * @param picture_4  the picture 4
     * @param picture_5  the picture 5
     * @param picture_6  the picture 6
     * @param videos     the videos
     * @param tablename  the tablename
     * @return the boolean
     */
    public boolean postAPost(String nickname,String content, String post_title, String picture_1, String picture_2, String picture_3, String picture_4, String picture_5, String picture_6, String videos, String tablename) {
        return postMapper.postAPost(nickname,content,post_title,picture_1,picture_2,picture_3,picture_4,picture_5,picture_6,videos,tablename);
    }

    /**
     * Search for last post posts.
     *
     * @param tablename the tablename
     * @return the posts
     */
    public Posts searchForLastPost(String tablename){
        return postMapper.searchForLastPost(tablename);
    }
}
