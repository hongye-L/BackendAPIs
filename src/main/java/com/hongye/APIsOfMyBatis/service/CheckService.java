package com.hongye.APIsOfMyBatis.service;

import com.hongye.APIsOfMyBatis.dao.CheckMapper;
import com.hongye.APIsOfMyBatis.entity.CheckBoard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CheckService {
    @Autowired
    private CheckMapper checkMapper;
    public boolean CheckinTables(String userid, String tablename) {
        return checkMapper.CheckinTables(userid, tablename);
    }
    public boolean addLeaderBoards(String userid) {
        return checkMapper.addLeaderBoards(userid);
    }
    public List<CheckBoard> getTodayLeaderBoard(){
        return checkMapper.getTodayLeaderBoard();
    }
}
