package com.hongye.APIsOfMyBatis.dao;

import com.hongye.APIsOfMyBatis.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * The interface Goods mapper.
 * @author 竑也
 */
@Mapper
public interface GoodsMapper {
    /**
     * Gets goods by user id.
     *
     * @param userid    the userid
     * @param tablename the tablename
     * @return the goods by user id
     */
    List<Goods> getGoodsByUserId(@Param("userid")String userid, @Param("tablename")String tablename);

    /**
     * Gets goods by second id.
     *
     * @param id        the id
     * @param tablename the tablename
     * @return the goods by second id
     */
    List<Goods> getGoodsBySecondId(@Param("id")String id,@Param("tablename")String tablename);

    /**
     * Add goods boolean.
     *
     * @param userid    the userid
     * @param id        the id
     * @param tablename the tablename
     * @param target    the target
     */
    void addGoods(@Param("userid")String userid,@Param("id")String id,@Param("tablename")String tablename,@Param("target")String target);

    /**
     * Delete goods boolean.
     *
     * @param userid    the userid
     * @param id        the id
     * @param tablename the tablename
     */
    void deleteGoods(@Param("userid")String userid,@Param("id")String id,@Param("tablename")String tablename);

    /**
     * Add goods to post boolean.
     *
     * @param target the target
     * @param postid the postid
     */
    void addGoodsToPost(@Param("target")String target,@Param("postid")String postid);

    /**
     * Add goods to comment boolean.
     *
     * @param target    the target
     * @param commentid the commentid
     */
    void addGoodsToComment(@Param("target")String target,@Param("commentid")String commentid);

    /**
     * Delete goods from post boolean.
     *
     * @param target the target
     * @param postid the postid
     */
    void  deleteGoodsFromPost(@Param("target")String target,@Param("postid")String postid);

    /**
     * Delete goods from comment boolean.
     *
     * @param target    the target
     * @param commentid the commentid
     */
    void deleteGoodsFromComment(@Param("target")String target,@Param("commentid")String commentid);

    /**
     * Check goods goods.
     *
     * @param userid    the userid
     * @param id        the id
     * @param tablename the tablename
     * @param target    the target
     * @return the goods
     */
    Goods checkGoods(@Param("userid")String userid,@Param("id")String id,@Param("tablename")String tablename,@Param("target")String target);
}
