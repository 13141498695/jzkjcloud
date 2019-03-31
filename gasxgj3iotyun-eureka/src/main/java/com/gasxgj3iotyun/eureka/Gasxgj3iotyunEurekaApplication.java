package com.gasxgj3iotyun.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer // 声明这是一个Eureka Server
@SpringBootApplication
public class Gasxgj3iotyunEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Gasxgj3iotyunEurekaApplication.class, args);
    }
}