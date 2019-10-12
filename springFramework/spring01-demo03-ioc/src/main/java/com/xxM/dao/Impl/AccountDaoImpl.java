package com.xxM.dao.Impl;

import com.xxM.dao.AccountDao;

/**
 * @Program: IntelliJ IDEA springFramework
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-08 09:58:42 周二
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
public class AccountDaoImpl implements AccountDao {
    @Override
    public void save() {
        System.out.println("AccountDaoImpl--->save()");
    }
    public void initMethod(){
        System.out.println("AccountDaoImpl--->initMethod()");
    }
    public void destroyMethod(){
        System.out.println("AccountDaoImpl--->destroyMethod()");
    }
}
