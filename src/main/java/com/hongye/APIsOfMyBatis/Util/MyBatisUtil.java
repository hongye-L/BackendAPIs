package com.hongye.APIsOfMyBatis.Util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * The type My batis util
 *
 * @author 竑也
 */
public class MyBatisUtil {
    /**
     * The Sql session factory.
     */
    static SqlSessionFactory sqlSessionFactory = null;

    static {
        try {
            // 加载mybatis配置文件，并创建SqlSessionFactory实例
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            //这个build方法可以接受几种不同的参数，如Reader/InputSteam等
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {

        }
    }

    /**
     * Gets sql session.
     *
     * @return the sql session
     */
    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }

    /**
     * Close sql session.
     *
     * @param sqlSession the sql session
     */
    public static void closeSqlSession(SqlSession sqlSession){
        if (sqlSession != null) {
            sqlSession.close();
        }
    }
}
