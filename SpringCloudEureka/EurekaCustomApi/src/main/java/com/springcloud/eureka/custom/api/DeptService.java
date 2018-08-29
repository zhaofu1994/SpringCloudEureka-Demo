package com.springcloud.eureka.custom.api;


import com.springcloud.eureka.custom.entity.Dept;

import java.util.List;

/**
 * @Filename: DeptService
 * @Description:
 * @Author: fu.zhao@PAAT.com
 * @Version: 1.0
 * @CreateTime: 2018/8/28 15:25
 * @History:
 */
public interface DeptService {
    /**
     * 增加实体
     *
     * @param dept
     * @return
     */
    boolean add(Dept dept);

    /**
     * 根据编号查询
     *
     * @param id
     * @return
     */
    Dept get(Long id);

    /**
     * 查询全部
     *
     * @return
     */
    List<Dept> list();
}
