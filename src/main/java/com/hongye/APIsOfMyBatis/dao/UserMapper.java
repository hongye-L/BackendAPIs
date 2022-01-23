package com.hongye.APIsOfMyBatis.dao;

import com.hongye.APIsOfMyBatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * The interface User mapper.
 *
 * @author 竑也
 */
@Mapper
public interface UserMapper {
    /**
     * Gets user by id.
     *
     * @param id the id
     * @return the user by id
     */
    User getUserById(@Param("id") Integer id);

    /**
     * Gets all user.
     *
     * @return the all user
     */
    List<User> getAllUser();

    /**
     * Login user.
     *
     * @param username the username
     * @param password the password
     * @return the user
     */
    User Login(@Param("username") String username, @Param("password") String password);

    /**
     * Register user.
     *
     * @param username the username
     * @param password the password
     * @return the user
     */
    boolean register(@Param("username") String username, @Param("password") String password);

    /**
     * Change password boolean.
     *
     * @param username       the username
     * @param password the password
     * @return the boolean
     */
    boolean changePassword(@Param("username") String username, @Param("password") String password);

    /**
     * Delete user boolean.
     *
     * @param id the id
     * @return the boolean
     */
    boolean deleteUser(@Param("id") String id);
}

