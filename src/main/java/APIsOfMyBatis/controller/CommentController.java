package APIsOfMyBatis.controller;

import APIsOfMyBatis.Util.GlobalReturnCode;
import APIsOfMyBatis.Util.JsonResult;
import APIsOfMyBatis.entity.Comments;
import APIsOfMyBatis.service.CommentService;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.jar.JarEntry;

/**
 * @author 竑也
 */
@RestController
@RequestMapping("comment")
public class CommentController {
    @Autowired
    private CommentService commentService;
    @PostMapping("getcommentbyid")
    public JsonResult getCommentsById(@RequestBody Map<String,String> map){
        Comments comments=commentService.getCommentsById(map.get("commentid"),map.get("post_id"), map.get("tablename"));
        //查找到了就输出
        if (comments!=null){
            return new JsonResult(true, GlobalReturnCode.OPERA_SUCCESS,comments);
        //如果为空则返回错误
        }else{
            return new JsonResult(false,GlobalReturnCode.NOEXIST);
        }
    }
    @PostMapping("getcommentbypost")
    public JsonResult getCommentsByPost(@RequestBody Map<String,String>map){
        List<Comments> comments = commentService.getCommentsByPost(map.get("post_id"),map.get("tablename"));
        //查找到了就输出
        if (comments!=null){
            return new JsonResult(true, GlobalReturnCode.OPERA_SUCCESS,comments);
        //如果为空则返回错误
        }else{
            return new JsonResult(false,GlobalReturnCode.NOEXIST);
        }
    }
    @PostMapping("addcomment")
    public JsonResult addComment(@RequestBody Map<String,String> map){
        boolean success=commentService.addComment(map.get("nickname"),map.get("userid"),map.get("postid"),map.get("content"),map.get("tablename"));
        //成功插入
        if (success) {
            return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS,success);
        //插入失败
        } else {
            return new JsonResult(false,GlobalReturnCode.OPERA_FAILURE);
        }
    }
    @PostMapping("deletecomment")
    public JsonResult deleteComment(@RequestBody Map<String,String>map){
        boolean success=commentService.deleteComment(map.get("postid"),map.get("commentid"),map.get("userid"),map.get("tablename"));
        //删除成功
        if (success) {
            return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS,success);
        //删除失败
        } else {
            return new JsonResult(false,GlobalReturnCode.NOEXIST);
        }
    }
}
