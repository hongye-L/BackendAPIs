package com.hongye.APIsOfMyBatis.service;

import com.hongye.APIsOfMyBatis.dao.ReplyMapper;
import com.hongye.APIsOfMyBatis.entity.Reply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplyService {
    @Autowired
    ReplyMapper replyMapper;
    public Reply getReplyById(String user_id, String comment_id, String tablename) {
        return replyMapper.getReplyById(user_id, comment_id, tablename);
    }

    public List<Reply> getReplyByCommentId(String comment_id, String tablename) {
        return replyMapper.getReplyByCommentId(comment_id, tablename);
    }

    public boolean addReply(String user_id, String content, String parent_id, String comment_id, String post_id, String tablename) {
        return replyMapper.addReply(user_id, content, parent_id, comment_id, post_id, tablename);
    }

    public boolean deleteCommentById(String user_id, String reply_id) {
        return replyMapper.deleteCommentById(user_id, reply_id);
    }
}
