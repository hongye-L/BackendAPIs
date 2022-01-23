package com.hongye.APIsOfMyBatis.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.InputStream;
class UserMapperTest {
    public UserMapper userMapper;
    @BeforeEach
    void setUp() throws Exception{
        String resource = "mybatis-config.xml";
        // 读取配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 构建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        this.userMapper=sqlSession.getMapper(UserMapper.class);
    }
    @Test
    void testGetUserById() {
        System.out.println(this.userMapper.getUserById(100002));
    }
    @Test
    void testGetALLUser(){
        System.out.println(this.userMapper.getAllUser());
    }
    @Test
    void testLogin(){
        System.out.println(this.userMapper.Login("test","test"));
    }
    @Test
    void testregister(){
        System.out.println(this.userMapper.register("test1","test1"));
    }
    @Test
    void testChangePassword(){
        System.out.println(this.userMapper.changePassword("100002","test1"));
    }
    @Test
    void testDeleteUser(){
        System.out.println(this.userMapper.deleteUser("100004"));
    }
}