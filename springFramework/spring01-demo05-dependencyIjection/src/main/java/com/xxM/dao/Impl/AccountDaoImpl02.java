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
public class AccountDaoImpl02 implements AccountDao {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "AccountDaoImpl02{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void save() {
        System.out.println("AccountDaoImpl--->save(),name=" + name + ",age=" + age);
    }
}
