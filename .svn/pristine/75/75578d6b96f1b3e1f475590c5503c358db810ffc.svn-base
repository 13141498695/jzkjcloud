package com.gasxgj3iotyun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@SpringCloudApplication
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan(basePackages = {"com.gasxgj3iotyun.dao"})
public class GasxgjAppApiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(GasxgjAppApiApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(GasxgjAppApiApplication.class);
	}
}
