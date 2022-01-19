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
 * @author 竑也
 */
@Service
public class PostService{
    @Autowired
    private PostMapper postMapper;
    public Posts getPostByIDAndTablename(Integer post_id, String tablename) {
        return postMapper.getPostByIDAndTablename(post_id,tablename);
    }

    public List<Posts> getAllPostsByTablename(String tablename) {
        return postMapper.getAllPostsByTablename(tablename);
    }

    public boolean deletePostByidAndTablename(Integer post_id, String tablename) {
        return postMapper.deletePostByidAndTablename(post_id,tablename);
    }

    public boolean postAPost(String nickname, String user_avatar, String content, String post_title, String picture_1, String picture_2, String picture_3, String picture_4, String picture_5, String picture_6, String videos, String tablename) {
        return postMapper.postAPost(nickname,user_avatar,content,post_title,picture_1,picture_2,picture_3,picture_4,picture_5,picture_6,videos,tablename);
    }
    public Posts searchForLastPost(String tablename){
        return postMapper.searchForLastPost(tablename);
    }
}
