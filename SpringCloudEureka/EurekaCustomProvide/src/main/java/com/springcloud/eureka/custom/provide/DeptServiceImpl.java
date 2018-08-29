package com.springcloud.eureka.custom.provide;

import com.springcloud.eureka.custom.api.DeptService;
import com.springcloud.eureka.custom.entity.Dept;
import com.springcloud.eureka.custom.mapper.DeptMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Filename: DeptServiceImpl
 * @Description:
 * @Author: fu.zhao@PAAT.com
 * @Version: 1.0
 * @CreateTime: 2018/8/28 15:26
 * @History:
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Resource
    private DeptMapper deptMapper;


    @Override
    public boolean add(Dept dept) {
        return deptMapper.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptMapper.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptMapper.findAll();
    }
}
