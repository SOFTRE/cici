package com.xxM.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @Program: IntelliJ IDEA sp
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-12 18:33:04 周六
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
