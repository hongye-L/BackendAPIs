package com.hongye.APIsOfMyBatis.dao;

import com.hongye.APIsOfMyBatis.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * The interface Goods mapper.
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
    Goods getGoodsByUserId(@Param("userid")String userid, @Param("tablename")String tablename);

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
     * @return the boolean
     */
    boolean addGoods(@Param("userid")String userid,@Param("id")String id,@Param("tablename")String tablename);

    /**
     * Delete goods boolean.
     *
     * @param userid    the userid
     * @param id        the id
     * @param tablename the tablename
     * @return the boolean
     */
    boolean deleteGoods(@Param("userid")String userid,@Param("id")String id,@Param("tablename")String tablename);

    /**
     * Add goods to post boolean.
     *
     * @param target the target
     * @param postid the postid
     * @return the boolean
     */
    boolean addGoodsToPost(@Param("target")String target,@Param("id")String postid);

    /**
     * Add goods to comment boolean.
     *
     * @param target    the target
     * @param commentid the commentid
     * @return the boolean
     */
    boolean addGoodsToComment(@Param("target")String target,@Param("id")String commentid);

    /**
     * Delete goods from post boolean.
     *
     * @param target the target
     * @param postid the postid
     * @return the boolean
     */
    boolean deleteGoodsFromPost(@Param("target")String target,@Param("id")String postid);

    /**
     * Delete goods from comment boolean.
     *
     * @param target    the target
     * @param commentid the commentid
     * @return the boolean
     */
    boolean deleteGoodsFromComment(@Param("target")String target,@Param("id")String commentid);
}
