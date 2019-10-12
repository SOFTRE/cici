package com.xxM.dao.Impl;

import com.xxM.dao.AccountDao;
import com.xxM.pojo.Account;

import java.util.Map;
import java.util.Set;

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
public class AccountDaoImpl05 implements AccountDao {
    private Account account;

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public void save() {
        System.out.println(account);
        System.out.println("AccountDaoImpl04--->save()");
    }
}
