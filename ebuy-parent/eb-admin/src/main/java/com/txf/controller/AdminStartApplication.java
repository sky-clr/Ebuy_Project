package com.txf.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.txf.controller","com.txf.service.impl"})
@MapperScan(basePackages = {"com.txf.mapper"})
public class AdminStartApplication {
    public static void main(String args[]) {
        SpringApplication.run(AdminStartApplication.class);
    }
}
