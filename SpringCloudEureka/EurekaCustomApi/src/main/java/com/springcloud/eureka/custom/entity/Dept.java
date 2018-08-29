package com.springcloud.eureka.custom.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Filename: Dept
 * @Description:
 * @Author: fu.zhao@PAAT.com
 * @Version: 1.0
 * @CreateTime: 2018/8/28 15:22
 * @History:
 */
@SuppressWarnings("serial")
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {
    private Long deptno;

    private String dname;

    private String db_source;

    public Dept(String dname) {
        super();
        this.dname = dname;
    }

    public static void main(String[] args) {
        Dept dept = new Dept();
        dept.setDeptno(11L).setDname("RD").setDb_source("DB01");
    }
}
