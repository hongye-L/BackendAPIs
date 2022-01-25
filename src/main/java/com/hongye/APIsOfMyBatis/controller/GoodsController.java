package com.hongye.APIsOfMyBatis.controller;

import com.hongye.APIsOfMyBatis.Util.GlobalReturnCode;
import com.hongye.APIsOfMyBatis.Util.JsonResult;
import com.hongye.APIsOfMyBatis.entity.Goods;
import com.hongye.APIsOfMyBatis.service.GoodsService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@RestController
@RequestMapping("goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;
    @PostMapping("getgoodsbyuserid")
    public JsonResult getGoodsByUserId(@RequestBody Map<String,String> map){
        Goods good=goodsService.getGoodsByUserId(map.get("userid"),map.get("tablename"));
        //查找到就输出
        if (good!=null) {
            return new JsonResult(true, GlobalReturnCode.OPERA_SUCCESS,good);
        } else {
            return new JsonResult(false,GlobalReturnCode.NOEXIST);
        }
    }
    @PostMapping("getgoodsbysecondid")
    public JsonResult getGoodsBySecondId(@RequestBody Map<String,String>map){
        List<Goods> goods=goodsService.getGoodsBySecondId(map.get("id"),map.get("tablename"));
        //查找到就输出
        if (goods!=null) {
            return new JsonResult(true, GlobalReturnCode.OPERA_SUCCESS,goods);
        } else {
            return new JsonResult(false,GlobalReturnCode.NOEXIST);
        }
    }
    @PostMapping("addgoods")
    public JsonResult addGoods(@RequestBody Map<String,String>map){
        boolean success=goodsService.addGoods(map.get("userid"),map.get("id"),map.get("tablename"));
        String target=map.get("target");
        if (success) {
            //用正则检查target参数里面的数据库类名
            if(Pattern.matches(target,".*post.*")) {
                boolean successful = goodsService.addGoodsToPost(target,map.get("id"));
                if (successful) {
                    return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS,successful);
                }else {
                    return new JsonResult(false,GlobalReturnCode.NOEXIST);
                }
            }
            //用正则检查target参数里面的数据库类名
            if (Pattern.matches(target,".*comment.*")){
                boolean successful =goodsService.addGoodsToComment(target,map.get("id"));
                if (successful) {
                    return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS,successful);
                } else {
                    return new JsonResult(false,GlobalReturnCode.NOEXIST);
                }
            }
        }
        //默认返回,一般走不到这一步
        return null;
    }
    @PostMapping("deletegoods")
    public JsonResult deleteGoods(@RequestBody Map<String, String>map){
        boolean success=goodsService.deleteGoods(map.get("userid"),map.get("id"),map.get("tablename"));
        String target=map.get("target");
        if (success) {
            //用正则检查target参数里面的数据库类名
            if(Pattern.matches(target,".*post.*")) {
                boolean successful = goodsService.deleteGoodsFromPost(target,map.get("id"));
                if (successful) {
                    return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS,successful);
                }else {
                    return new JsonResult(false,GlobalReturnCode.NOEXIST);
                }
            }
            //用正则检查target参数里面的数据库类名
            if (Pattern.matches(target,".*comment.*")){
                boolean successful =goodsService.deleteGoodsFromComment(target,map.get("id"));
                if (successful) {
                    return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS,successful);
                } else {
                    return new JsonResult(false,GlobalReturnCode.NOEXIST);
                }
            }
        }
        //默认返回,一般走不到这一步
        return null;
    }
}
