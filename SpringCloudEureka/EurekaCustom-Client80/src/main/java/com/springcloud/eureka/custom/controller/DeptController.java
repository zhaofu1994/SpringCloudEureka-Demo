package com.springcloud.eureka.custom.controller;


import com.springcloud.eureka.custom.entity.Dept;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Filename: DeptController
 * @Description:
 * @Author: fu.zhao@PAAT.com
 * @Version: 1.0
 * @CreateTime: 2018/8/28 18:03
 * @History:
 */
@RestController
public class DeptController {

    private static final String REST_URL_PREFIX = "http://EUREKA-CUSTOM-SERVICE/";

    @Resource
    RestTemplate restTemplate;


    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "dept/get/" + id, Dept.class);
    }

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "dept/add", dept, Boolean.class);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "dept/list", List.class);
    }

    @GetMapping(value = "/consumer/dept/discovery")
    public Object discovery() { return restTemplate.getForObject(REST_URL_PREFIX + "dept/discovery", Object.class);
    }
}
