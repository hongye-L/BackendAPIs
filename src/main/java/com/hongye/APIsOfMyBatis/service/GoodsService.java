package com.hongye.APIsOfMyBatis.service;

import com.hongye.APIsOfMyBatis.dao.GoodsMapper;
import com.hongye.APIsOfMyBatis.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Goods service.
 * @author 竑也
 */
@Service
public class GoodsService{
    @Autowired
    private GoodsMapper goodsMapper;

    /**
     * Gets goods by user id.
     *
     * @param userid    the userid
     * @param tablename the tablename
     * @return the goods by user id
     */
    public Goods getGoodsByUserId(String userid, String tablename) {
        return goodsMapper.getGoodsByUserId(userid,tablename);
    }

    /**
     * Gets goods by second id.
     *
     * @param id        the id
     * @param tablename the tablename
     * @return the goods by second id
     */
    public List<Goods> getGoodsBySecondId(String id, String tablename) {
        return goodsMapper.getGoodsBySecondId(id,tablename);
    }

    /**
     * Add goods boolean.
     *
     * @param userid    the userid
     * @param id        the id
     * @param tablename the tablename
     */
    public void addGoods(String userid, String id, String tablename,String target) {
        goodsMapper.addGoods(userid,id,tablename,target);
    }

    /**
     * Delete goods boolean.
     *
     * @param userid    the userid
     * @param id        the id
     * @param tablename the tablename
     */
    public void deleteGoods(String userid, String id, String tablename) {
        goodsMapper.deleteGoods(userid,id,tablename);
    }

    /**
     * Add goods to post boolean.
     *
     * @param target the target
     * @param postid the postid
     */
    public void addGoodsToPost(String target, String postid) {
        goodsMapper.addGoodsToPost(target,postid);
    }

    /**
     * Add goods to comment boolean.
     *
     * @param target    the target
     * @param commentid the commentid
     */
    public void addGoodsToComment(String target, String commentid) {
         goodsMapper.addGoodsToComment(target,commentid);
    }

    /**
     * Delete goods from post boolean.
     *
     * @param target the target
     * @param postid the postid
     */
    public void deleteGoodsFromPost(String target, String postid) {
        goodsMapper.deleteGoodsFromPost(target,postid);
    }

    /**
     * Delete goods from comment boolean.
     *
     * @param target    the target
     * @param commentid the commentid
     */
    public void deleteGoodsFromComment(String target, String commentid) {
        goodsMapper.deleteGoodsFromComment(target,commentid);
    }
    public Goods check(String userid, String id, String tablename,String target){
        return goodsMapper.checkGoods(userid,id,tablename,target);
    }
}
