package com.xxM.service.impl;

import com.xxM.dao.AccountDao;
import com.xxM.domain.Account;
import com.xxM.service.AccountService;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Program: IntelliJ IDEA sp
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-12 19:00:19 周六
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@Service
@Aspect
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    @Transactional
    public void update(Account from, Account to, Double money) {
        from.setMoney(from.getMoney() - money);
        to.setMoney(to.getMoney() + money);
        accountDao.update(from);
        accountDao.update(to);
    }

    @Override
    public Account findById(Integer id) {
        return accountDao.findById(id);
    }
}
