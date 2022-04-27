package com.hongye.APIsOfMyBatis.controller;

import com.hongye.APIsOfMyBatis.Util.GlobalReturnCode;
import com.hongye.APIsOfMyBatis.Util.JsonResult;
import com.hongye.APIsOfMyBatis.entity.Files;
import com.hongye.APIsOfMyBatis.service.FilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * The type Files controller.
 * @author 竑也
 */
@RestController
@RequestMapping("files")
public class FilesController {
    /**
     * The Files service.
     */
    @Autowired
    FilesService filesService;

    /**
     * Create file json result.
     *
     * @param map the map
     * @return the json result
     */
    @PostMapping("createfile")
    public JsonResult createFile(@RequestBody Map<String, String> map){
        filesService.createFiles(map.get("user_id"),map.get("address"),map.get("plate"),map.get("targetid"));
        return new JsonResult(true, GlobalReturnCode.OPERA_SUCCESS);
    }

    /**
     * Get files json result.
     *
     * @param map the map
     * @return the json result
     */
    public JsonResult getFiles(@RequestBody Map<String, String> map){
        List<Files> files=filesService.getFilesbyuserId(map.get("user_id"));
        if(files!=null){
            return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS,files);
        }else{
            return new JsonResult(false,GlobalReturnCode.NOEXIST);
        }
    }

    /**
     * Delete files json result.
     *
     * @param map the map
     * @return the json result
     */
    public JsonResult deleteFiles(@RequestBody Map<String, String> map){
        filesService.deleteFiles(map.get("user_id"),map.get("targetid"));
        Files isdone=filesService.checkFiles(map.get("user_id"),map.get("targetid"));
        if (isdone==null){
            return new JsonResult(true,GlobalReturnCode.DELETE_SUCCESS);
        }else {
            return new JsonResult(false,GlobalReturnCode.NOEXIST);
        }
    }

}
