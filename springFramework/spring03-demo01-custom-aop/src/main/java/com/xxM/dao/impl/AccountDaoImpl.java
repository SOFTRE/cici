package com.xxM.dao.impl;

import com.xxM.dao.AccountDao;

/**
 * @Program: IntelliJ IDEA springFramework
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-10 20:55:58 周四
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
public class AccountDaoImpl implements AccountDao {
    @Override
    public void save() {
        System.out.println("AccountDaoImpl-->save");
    }

    @Override
    public void update() {
        System.out.println("AccountDaoImpl-->update");
    }

    @Override
    public String delete() {
        System.out.println("AccountDaoImpl-->delete");
        return "delete OK";
    }

    @Override
    public void findById() {
        System.out.println("AccountDaoImpl-->findById");
        int i=1/0;
    }

    @Override
    public void findAll() {
        System.out.println("AccountDaoImpl-->findAll");
    }
}
