package com.itheima.service;

import com.itheima.domain.Account;

public interface AccountService {
    void update(Account from, Account to, Double money);

    Account findById(Integer id);
}
