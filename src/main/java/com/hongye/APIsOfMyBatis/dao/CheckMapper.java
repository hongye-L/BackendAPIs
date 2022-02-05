package com.hongye.APIsOfMyBatis.dao;

import com.hongye.APIsOfMyBatis.entity.CheckBoard;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * The interface Check mapper.
 *
 * @author 竑也
 */
@Mapper
public interface CheckMapper {
    /**
     * Checkin tables boolean.
     *
     * @param userid    the userid
     * @param tablename the tablename
     * @return the boolean
     */
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
