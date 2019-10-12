package com.xxM.dao.Impl;

import com.xxM.dao.AccountDao;

/**
 * @Program: IntelliJ IDEA springFramework
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-08 13:59:22 周二
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
public class AccountDaoImpl implements AccountDao {
    private String name;
    private Integer age;

    public AccountDaoImpl(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void save() {
        System.out.println("AccountDaoImpl--->save(),name=" + name + ",age=" + age);
    }
}
