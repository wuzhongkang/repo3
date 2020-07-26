package com.czxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @param
 * @author康大
 * @2020/6/17
 * @authorASUS
 * @return 返回值
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.czxy.wzk")
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class);
    }
}
