package com.springcloud.eureka.custom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Filename: EurekaCustom8001
 * @Description: SpringCloud Eureka客户端
 * @Author: fu.zhao@PAAT.com
 * @Version: 1.0
 * @CreateTime: 2018/8/28 16:11
 * @History:
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaCustom8001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaCustom8001.class, args);
    }
}
