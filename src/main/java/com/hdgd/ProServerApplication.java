package com.hdgd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.hdgd.mapper")
public class ProServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProServerApplication.class, args);
    }

}
