package com.gec.shopping;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@MapperScan(basePackages = "com.gec.shopping.mapper")
@SpringBootApplication
public class ShopManagerMSApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShopManagerMSApplication.class,args);
    }
}
