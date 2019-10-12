package com.xxM.service.impl;

import com.xxM.dao.AccountDao;
import com.xxM.domain.Account;
import com.xxM.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Program: IntelliJ IDEA springFramework
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-12 10:35:36 周六
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    public void save(Account account) {
        accountDao.save(account);
    }

    @Override
    public void update(Account account) {
        accountDao.update(account);
    }

    @Override
    public void delete(Integer id) {
        accountDao.delete(id);
    }

    @Override
    public Account findById(Integer id) {
        return accountDao.findById(id);
    }

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    public Integer count() {
        return accountDao.count();
    }

    @Override
    public void trans(Account from, Account to,Double money) {
        from.setMoney(from.getMoney()-money);
        to.setMoney(to.getMoney()+money);
        accountDao.update(from);
        accountDao.update(to);
    }
}
