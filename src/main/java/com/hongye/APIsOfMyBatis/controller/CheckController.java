package com.hongye.APIsOfMyBatis.controller;

import com.hongye.APIsOfMyBatis.Util.GlobalReturnCode;
import com.hongye.APIsOfMyBatis.Util.JsonResult;
import com.hongye.APIsOfMyBatis.entity.CheckBoard;
import com.hongye.APIsOfMyBatis.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("check")
public class CheckController{
    @Autowired
    private CheckService checkService;
    @PostMapping("checkintablename")
    public JsonResult CheckInTablename(@RequestBody Map<String,String>map){
        boolean check=checkService.CheckinTables(map.get("userid"),map.get("tablename"));
        if (check) {
            checkService.addLeaderBoards(map.get("userid"));
            return new JsonResult(true, GlobalReturnCode.AUDIT_SUCCESS,check);
        } else {
            return new JsonResult(false,GlobalReturnCode.NOEXIST);
        }
    }
    @PostMapping("todayleaderboard")
    public JsonResult getTodayLeaderBoard(){
        List<CheckBoard> checkBoardList=checkService.getTodayLeaderBoard();
        return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS,checkBoardList);
    }
}
