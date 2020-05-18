package com.aaa.jhh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * @Author: Jia Hao Hao
 * @Date: 2020-05-12 09:32
 * @Description:
 **/
@SpringBootApplication
@EnableEurekaServer
public class ApplicationRun7082 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun7082.class,args);
    }
}
