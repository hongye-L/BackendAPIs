package APIsOfMyBatis.controller;

import APIsOfMyBatis.Util.GlobalReturnCode;
import APIsOfMyBatis.Util.JsonResult;
import APIsOfMyBatis.entity.Posts;
import APIsOfMyBatis.service.PostService;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("post")
public class PostController {
    @Autowired
    private PostService postService;
    @PostMapping("getPost")
    public JsonResult getPostByIDAndTablename(@RequestBody Map<String,String> map){
        Posts post=postService.getPostByIDAndTablename(Integer.valueOf(map.get("post_id")),map.get("tablename"));
        //查找到了就输出
        if(post!=null) {
            return new JsonResult(true, GlobalReturnCode.OPERA_SUCCESS,post);
        }
        //如果为空则返回错误
        else {
            return new JsonResult(false,GlobalReturnCode.NOEXIST);
        }
    }
    @PostMapping("getPosts")
    public JsonResult getAllPostsByTablename(@RequestBody Map<String,String> map){
        List<Posts> posts = postService.getAllPostsByTablename(map.get("tablename"));
        //查找到了就输出
        if(posts!=null) {
            return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS,posts);
        }
        //如果为空则返回错误
        else {
            return new JsonResult(false,GlobalReturnCode.NOEXIST);
        }
    }
    @PostMapping("deletepost")
    public JsonResult deletePostByidAndTablename(@RequestBody Map<String,String> map){
        boolean success =postService.deletePostByidAndTablename(Integer.valueOf(map.get("post_id")),map.get("tablename"));
        //删除成功
        if (success) {
            return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS,success);
        }
        //删除失败
        else {
            return new JsonResult(false,GlobalReturnCode.NOEXIST);
        }
    }
    @PostMapping("postapost")
    public JsonResult postAPost(@RequestBody Map<String,String> map){
        boolean success=postService.postAPost(map.getOrDefault("userid",null),
                map.getOrDefault("user_avatar",null),map.getOrDefault("content",null),
                map.getOrDefault("post_title",null),map.getOrDefault("picture_1",null),
                map.getOrDefault("picture_2",null), map.getOrDefault("picture_3",null),
                map.getOrDefault("picture_4",null),
                map.getOrDefault("picture_5",null),map.getOrDefault("picture_6",null),
                map.getOrDefault("videos",null),
                map.get("tablename"));
        Posts lastpost=postService.searchForLastPost(map.getOrDefault("tablename",null));
        if(success) {
            return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS,lastpost);
        } else {
            return new JsonResult(false,GlobalReturnCode.OPERA_FAILURE);
        }
    }
}
