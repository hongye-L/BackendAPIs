package com.hongye.APIsOfMyBatis.controller;

import com.hongye.APIsOfMyBatis.Util.GlobalReturnCode;
import com.hongye.APIsOfMyBatis.Util.JsonResult;
import com.hongye.APIsOfMyBatis.entity.Comments;
import com.hongye.APIsOfMyBatis.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

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
        Comments comments=commentService.getCommentsById(map.get("comment_id"), map.get("tablename"));
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
        commentService.addComment(map.getOrDefault("userid",null),
                map.getOrDefault("post_id",null),map.getOrDefault("content",null),map.getOrDefault("tablename",null));
        Comments success=commentService.check(map.get("tablename"),map.get("content"));
        //成功插入
        if (success!=null) {
            return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS,success);
        //插入失败
        } else {
            return new JsonResult(false,GlobalReturnCode.OPERA_FAILURE);
        }
    }
    @PostMapping("deletecomment")
    public JsonResult deleteComment(@RequestBody Map<String,String>map){
        commentService.deleteComment(map.get("post_id"),map.get("comment_id"),map.get("user_id"),map.get("tablename"));
        Comments success=commentService.getCommentsById(map.get("comment_id"),map.get("tablename"));
        //删除成功
        if (success==null) {
            return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS);
        //删除失败
        } else {
            return new JsonResult(false,GlobalReturnCode.NOEXIST);
        }
    }
}
