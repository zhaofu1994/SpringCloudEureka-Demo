package com.springcloud.eureka.custom.controller;

import com.springcloud.eureka.custom.api.DeptService;
import com.springcloud.eureka.custom.entity.Dept;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Filename: DeptController
 * @Description:
 * @Author: fu.zhao@PAAT.com
 * @Version: 1.0
 * @CreateTime: 2018/8/28 16:11
 * @History:
 */
@RestController
public class DeptController {

    @Resource
    private DeptService deptService;

    @Resource
    private DiscoveryClient discoveryClient;


    @PostMapping(value = "/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable Long id) {
        return deptService.get(id);
    }

    @GetMapping(value = "/dept/list")
    public List<Dept> list() {
        List<Dept> list = deptService.list();
        System.out.println(list);
        return list;
    }


    @GetMapping(value = "/dept/discovery")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        System.out.println("******************" + services);
        List<ServiceInstance> instances = discoveryClient.getInstances("EUREKACUSTOM");
        for (ServiceInstance element : instances) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t" + element.getUri());
        }
        return this.discoveryClient;
    }
}