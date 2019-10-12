package com.xxM.dao.Impl;

import com.xxM.dao.AccountDao;

/**
 * @Program: IntelliJ IDEA springFramework
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-08 13:11:55 周二
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
public class AccountDaoImpl implements AccountDao {
    private String name;
    public AccountDaoImpl(String name){
        this.name=name;
    }

    public AccountDaoImpl() {
    }

    @Override
    public void save() {
        System.out.println("AccountDaoImpl-->save()");
    }
}
