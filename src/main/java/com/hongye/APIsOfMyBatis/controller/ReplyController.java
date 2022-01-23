package com.hongye.APIsOfMyBatis.controller;
import com.hongye.APIsOfMyBatis.Util.GlobalReturnCode;
import com.hongye.APIsOfMyBatis.Util.JsonResult;
import com.hongye.APIsOfMyBatis.entity.Reply;
import com.hongye.APIsOfMyBatis.service.ReplyService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

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
    @PostMapping("addreply")
    public JsonResult addReply(@RequestBody Map<String,String>map){
        boolean success=replyService.addReply(map.get("user_id"),map.get("content"),map.get("parent_id"),
                map.get("comment_id"),map.get("post_id"),map.get("tablname"));
        if (success) {
            return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS,success);
        } else {
            return new JsonResult(false,GlobalReturnCode.NOEXIST);
        }
    }
    @PostMapping("deletecommentbyid")
    public JsonResult deleteCommentById(@RequestBody Map<String,String>map){
        boolean success=replyService.deleteCommentById(map.get("user_id"),map.get("reply_id"));
        if(success) {
            return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS,success);
        } else {
            return new JsonResult(false,GlobalReturnCode.NOEXIST);
        }
    }
}
