package com.hongye.APIsOfMyBatis.controller;

import com.hongye.APIsOfMyBatis.Util.GlobalReturnCode;
import com.hongye.APIsOfMyBatis.Util.JsonResult;
import com.hongye.APIsOfMyBatis.entity.Reply;
import com.hongye.APIsOfMyBatis.service.ReplyService;
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
@RequestMapping("reply")
public class ReplyController {
    @Autowired
    ReplyService replyService;
    @PostMapping("getreplybyid")
    public JsonResult getReplyById(@RequestBody Map<String,String> map){
        Reply reply=replyService.getReplyById(map.get("user_id"),map.get("comment_id"),map.get("tablename"));
        if (reply!=null) {
            //查找到了就输出
            return new JsonResult(true, GlobalReturnCode.OPERA_SUCCESS,reply);
        } else {
            //没有则输出错误
            return new JsonResult(false,GlobalReturnCode.NOEXIST);
        }
    }
    @PostMapping("getreplybycommentid")
    public JsonResult getReplyByCommentId(@RequestBody Map<String,String> map){
        List<Reply> replies=replyService.getReplyByCommentId(map.get("comment_id"),map.get("tablename"));
            if (replies!=null) {
                return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS,replies);
            } else {
                return new JsonResult(false,GlobalReturnCode.NOEXIST);
            }
    }
    @PostMapping("getreplybyUID")
    public JsonResult getReplyByUID(@RequestBody Map<String,String> map){
        List<Reply> replies=replyService.getReplyByUID(map.get("user_id"),map.get("tablename"));
        if (replies!=null) {
            return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS,replies);
        } else {
            return new JsonResult(false,GlobalReturnCode.NOEXIST);
        }
    }
    @PostMapping("addreply")
    public JsonResult addReply(@RequestBody Map<String,String>map){
        replyService.addReply(map.get("user_id"),map.get("content"),map.getOrDefault("parent_id","0"),
                map.getOrDefault("comment_id",null),map.getOrDefault("post_id",null),map.get("tablename"));
        replyService.addreplyto(map.get("target"),map.get("post_id"));
        Reply success=replyService.check(map.get("content"),map.get("tablename"));
        if (success!=null) {
            return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS,success);
        } else {
            return new JsonResult(false,GlobalReturnCode.NOEXIST);
        }
    }
    @PostMapping("deletereplybyid")
    public JsonResult deleteReplyById(@RequestBody Map<String,String>map){
        replyService.deleteReplyById(map.get("user_id"),map.get("reply_id"),map.get("tablename"));
        replyService.deletereplyto(map.get("target"),map.get("post_id"));
        Reply success=replyService.checkByID(map.get("reply_id"),map.get("tablename"));
        if(success==null) {
            return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS);
        } else {
            return new JsonResult(false,GlobalReturnCode.NOEXIST);
        }
    }
}
