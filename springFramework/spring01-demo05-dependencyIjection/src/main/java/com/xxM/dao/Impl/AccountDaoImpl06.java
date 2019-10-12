package com.xxM.dao.Impl;

import com.xxM.dao.AccountDao;
import com.xxM.pojo.Account;

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
public class AccountDaoImpl06 implements AccountDao {
   private String username;
    private Integer age;
    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public void save() {
        System.out.println(username+"---"+age);
        System.out.println("AccountDaoImpl06--->save()");
    }
}
