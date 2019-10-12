package com.xxM.service.Impl;

import com.xxM.dao.AccountDao;
import com.xxM.dao.Impl.AccountDaoImpl;
import com.xxM.service.AccountService;
import com.xxM.utils.BeanFactory;
import com.xxM.utils.BeanFactory02;

/**
 * @Program: IntelliJ IDEA springFramework
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-07 21:34:16 周一
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao= (AccountDao) BeanFactory02.getById("accountDao");
    @Override
    public void update() {
        accountDao.update();
        System.out.println("AccountServiceImpl--->update()");
    }
}
