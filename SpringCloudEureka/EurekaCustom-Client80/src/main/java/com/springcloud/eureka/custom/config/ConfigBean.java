package com.springcloud.eureka.custom.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Filename: ConfigBean
 * @Description:
 * @Author: fu.zhao@PAAT.com
 * @Version: 1.0
 * @CreateTime: 2018/8/29 9:54
 * @History:
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced  //本注解加软负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
