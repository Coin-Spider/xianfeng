package com.rum.xianfeng;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
@MapperScan("com.rum.xianfeng.Mapper")
public class XianfengApplication {
    public static void main(String[] args) {
        SpringApplication.run(XianfengApplication.class, args);
    }
}
