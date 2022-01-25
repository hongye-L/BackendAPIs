package com.hongye.APIsOfMyBatis.service;

import com.hongye.APIsOfMyBatis.dao.GoodsMapper;
import com.hongye.APIsOfMyBatis.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsService{
    @Autowired
    private GoodsMapper goodsMapper;
    public Goods getGoodsByUserId(String userid, String tablename) {
        return goodsMapper.getGoodsByUserId(userid,tablename);
    }

    public List<Goods> getGoodsBySecondId(String id, String tablename) {
        return goodsMapper.getGoodsBySecondId(id,tablename);
    }

    public boolean addGoods(String userid, String id, String tablename) {
        return goodsMapper.addGoods(userid,id,tablename);
    }

    public boolean deleteGoods(String userid, String id, String tablename) {
        return goodsMapper.deleteGoods(userid,id,tablename);
    }

    public boolean addGoodsToPost(String target, String postid) {
        return goodsMapper.addGoodsToPost(target,postid);
    }

    public boolean addGoodsToComment(String target, String commentid) {
        return goodsMapper.addGoodsToComment(target,commentid);
    }

    public boolean deleteGoodsFromPost(String target, String postid) {
        return goodsMapper.deleteGoodsFromPost(target,postid);
    }

    public boolean deleteGoodsFromComment(String target, String commentid) {
        return goodsMapper.deleteGoodsFromComment(target,commentid);
    }
}
