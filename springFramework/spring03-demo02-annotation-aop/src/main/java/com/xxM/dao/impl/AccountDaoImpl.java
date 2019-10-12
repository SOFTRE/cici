package com.xxM.dao.impl;

import com.xxM.dao.AccountDao;
import org.springframework.stereotype.Repository;

/**
 * @Program: IntelliJ IDEA springFramework
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-11 08:58:34 周五
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@Repository
public class AccountDaoImpl implements AccountDao {
    @Override
    public void save() {
        System.out.println("AccountDaoImpl-->save()");
    }

    @Override
    public void update() {
        System.out.println("AccountDaoImpl-->update()");
    }

    @Override
    public String delete() {
        System.out.println("AccountDaoImpl-->delete()");
        return null;
    }

    @Override
    public void findById() {
        System.out.println("AccountDaoImpl-->findById()");

    }

    @Override
    public void findAll() {
        System.out.println("AccountDaoImpl-->findAll()");

    }
}
