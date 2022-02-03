package com.hongye.APIsOfMyBatis.dao;

import com.hongye.APIsOfMyBatis.entity.CheckBoard;
import com.hongye.APIsOfMyBatis.entity.Posts;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * The interface Check mapper.
 */
@Mapper
public interface CheckMapper {
    boolean CheckinTables(@Param("userid")String userid,@Param("tablename")String tablename);

    /**
     * Add leader boards boolean.
     *
     * @param userid the userid
     * @return the boolean
     */
    boolean addLeaderBoards(@Param("userid")String userid);

    /**
     * Gets today leader board.
     *
     * @return the today leader board
     */
    List<CheckBoard> getTodayLeaderBoard();
}
