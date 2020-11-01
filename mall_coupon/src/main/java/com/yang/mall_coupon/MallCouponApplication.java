package com.yang.mall_coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.yang.mall_coupon.dao")
//@ComponentScan("com.yang")
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages = "com.yang.mall_coupon.feign")
public class MallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallCouponApplication.class, args);
    }

}
