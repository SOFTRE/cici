package com.xxM.dao.impl;

import com.xxM.dao.AccountDao;
import org.springframework.stereotype.Repository;

/**
 * @Program: IntelliJ IDEA springFramework
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-09 08:40:46 周三
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {
    @Override
    public void delete() {
        System.out.println("AccountDaoImpl-->delete()");
    }
}
