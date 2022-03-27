package com.hongye.APIsOfMyBatis.service;

import com.hongye.APIsOfMyBatis.dao.UserMapper;
import com.hongye.APIsOfMyBatis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * The type User service.
 *
 * @author 竑也
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RedisTemplate redisTemplate;
    /**
     * Get all users list.
     *
     * @return the list
     */
    public List<User> getAllUsers(){
        return userMapper.getAllUser();
    }

    /**
     * Get user by id user.
     *
     * @param id the id
     * @return the user
     */
    public User getUserById(Integer id){
        String key=String.valueOf(id);
        ValueOperations<String,User> operations=redisTemplate.opsForValue();
        Boolean haveKey=redisTemplate.hasKey(key);
        if(Boolean.TRUE.equals(haveKey)){
            return operations.get(key);
        }else {
            User user= userMapper.getUserById(id);
            operations.set(key,user,30, TimeUnit.DAYS);
            return user;
        }
    }

    /**
     * Login user.
     *
     * @param username the username
     * @param password the password
     * @return the user
     */
    public User login(String username,String password){
        return userMapper.Login(username,password);
    }

    /**
     * Change password boolean.
     *
     * @param username the username
     * @param password the password
     * @return the boolean
     */
    public boolean changePassword(String username,String password){
        return userMapper.changePassword(username,password);
    }

    /**
     * Register boolean.
     *
     * @param username the username
     * @param password the password
     * @return the boolean
     */
    public boolean register(String username,String password){
        return userMapper.register(username,password);
    }

    /**
     * Delete user boolean.
     *
     * @param id the id
     * @return the boolean
     */
    public boolean deleteUser(String id){
        return userMapper.deleteUser(id);
    }
}
