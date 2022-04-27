package com.hongye.APIsOfMyBatis.dao;

import com.hongye.APIsOfMyBatis.entity.Files;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * The interface Files mapper.
 * @author 竑也
 */
@Mapper
public interface FilesMapper {

    /**
     * Gets files user id.
     *
     * @param userId the user id
     * @return the files
     */
    List<Files> getFilesbyuserId(@Param("user_id")String userId);

    /**
     * Create files files.
     *
     * @param userId   the user id
     * @param address  the address
     * @param plate    the plate
     * @param targetId the target id
     */
    void createFiles(@Param("user_id")String userId,@Param("address")String address,@Param("plate")String plate,@Param("targetid")String targetId);

    /**
     * Delete files files.
     *
     * @param userId   the user id
     * @param targetid the targetid
     */
    void deleteFiles(@Param("user_id")String userId,@Param("targetid")String targetid);

    /**
     * Check files files.
     *
     * @param userId   the user id
     * @param targetid the targetid
     * @return the files
     */
    Files checkFiles(@Param("user_id")String userId,@Param("targetid")String targetid);
}
