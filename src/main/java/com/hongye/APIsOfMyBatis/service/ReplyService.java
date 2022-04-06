package com.hongye.APIsOfMyBatis.service;

import com.hongye.APIsOfMyBatis.dao.ReplyMapper;
import com.hongye.APIsOfMyBatis.entity.Reply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 竑也
 */
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

    public void addReply(String user_id, String content, String parent_id, String comment_id, String post_id, String tablename) {
        replyMapper.addReply(user_id, content, parent_id, comment_id, post_id, tablename);
    }

    public void deleteReplyById(String user_id, String reply_id,String tablename) {
        replyMapper.deleteReplyById(user_id, reply_id,tablename);
    }
    public Reply check(String content,String tablename){
        return replyMapper.check(tablename,content);
    }
    public Reply checkByID(String reply_id,String tablename){
        return replyMapper.checkById(reply_id,tablename);
    }
    public void addreplyto(String target,String post_id){replyMapper.addreplyto(target,post_id);}
    public void deletereplyto(String target,String post_id){replyMapper.deletereplyto(target, post_id);}

    public List<Reply> getReplyByUID(String user_id, String tablename) {
        return replyMapper.getReplyByUID(user_id, tablename);
    }
}
