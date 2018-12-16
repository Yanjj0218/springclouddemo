package com.wd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.wd.mapper")
public class SpringcloudproviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudproviderApplication.class, args);
    }

}

