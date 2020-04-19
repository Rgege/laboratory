package com.labs.springcloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
/**
 * 声明为一个eureka客户端
 */
@EnableEurekaClient
/**
 * 声明为网关服务
 */
@EnableZuulProxy
public class SpringcloudZuulServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudZuulServiceApplication.class, args);
    }

}
