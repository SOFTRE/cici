package com.xxM.dao.Impl;

import com.xxM.dao.AccountDao;

import java.util.List;

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
public class AccountDaoImpl03 implements AccountDao {
   private List<String> hobby;

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    @Override
    public void save() {
        for (String s : hobby) {
            System.out.println(s);
        }
        System.out.println("AccountDaoImpl--->save()");
    }
}
