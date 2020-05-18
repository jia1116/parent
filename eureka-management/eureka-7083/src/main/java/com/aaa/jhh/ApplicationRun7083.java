package com.aaa.jhh;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: Jia Hao Hao
 * @Date: 2020-05-12 09:34
 * @Description:
 **/
@SpringBootApplication
@EnableEurekaServer
public class ApplicationRun7083 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun7083.class,args);
    }
}
