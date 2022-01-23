package com.hongye.APIsOfMyBatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 竑也
 */
@SpringBootApplication
@MapperScan("com.hongye.APIsOfMyBatis.dao")
public class StartApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class,args);
    }
}
