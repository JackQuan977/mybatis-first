package com.example.mybatisfirst;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mybatisfirst.mapper")
public class MybatisFirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisFirstApplication.class, args);
    }

}
