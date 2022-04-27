package com.hongye.APIsOfMyBatis.service;

import com.hongye.APIsOfMyBatis.dao.FilesMapper;
import com.hongye.APIsOfMyBatis.entity.Files;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 竑也
 */
@Service
public class FilesService {
    @Autowired
    FilesMapper filesMapper;
    public List<Files> getFilesbyuserId(String userId){
        return filesMapper.getFilesbyuserId(userId);
    }
    public void createFiles(String userId,String address,String plate,String targetid){
        filesMapper.createFiles(userId, address, plate, targetid);
    }
    public void deleteFiles(String userId,String targetid){
        filesMapper.deleteFiles(userId,targetid);
    }
    public Files checkFiles(String userId,String targetid){
        return filesMapper.checkFiles(userId,targetid);
    }
}
