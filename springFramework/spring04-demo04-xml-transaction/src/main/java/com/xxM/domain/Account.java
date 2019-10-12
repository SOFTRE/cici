package com.xxM.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @Program: IntelliJ IDEA springFramework
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-11 19:56:02 周五
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@Data
public class Account implements Serializable {
    private Integer id;
    private String name;
    private Double money;
}
