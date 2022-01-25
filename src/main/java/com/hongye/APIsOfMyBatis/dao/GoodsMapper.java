package com.hongye.APIsOfMyBatis.dao;

import com.hongye.APIsOfMyBatis.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface GoodsMapper {
    Goods getGoodsByUserId(@Param("userid")String userid, @Param("tablename")String tablename);
    List<Goods> getGoodsBySecondId(@Param("id")String id,@Param("tablename")String tablename);
    boolean addGoods(@Param("userid")String userid,@Param("id")String id,@Param("tablename")String tablename);
    boolean deleteGoods(@Param("userid")String userid,@Param("id")String id,@Param("tablename")String tablename);
    boolean addGoodsToPost(@Param("target")String target,@Param("id")String postid);
    boolean addGoodsToComment(@Param("target")String target,@Param("id")String commentid);
    boolean deleteGoodsFromPost(@Param("target")String target,@Param("id")String postid);
    boolean deleteGoodsFromComment(@Param("target")String target,@Param("id")String commentid);
}
