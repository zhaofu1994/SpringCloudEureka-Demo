package com.springcloud.eureka.custom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * @Filename: EurekaCustom80
 * @Description:
 * @Author: fu.zhao@PAAT.com
 * @Version: 1.0
 * @CreateTime: 2018/8/28 18:00
 * @History:
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaCustom80 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaCustom80.class, args);
    }

}
