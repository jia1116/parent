package com.aaa.jhh.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author: Jia Hao Hao
 * @Date: 2020-05-15 21:11
 * @Description:
 **/
@Component
@ConfigurationProperties(prefix = "spring.ftp")
@PropertySource("classpath:properties/ftp.properties")
@Data
public class FtpProperties {
    private String host;
    private Integer port;
    private String username;
    private String password;
    private String basePath;
    private String httpPath;
}
