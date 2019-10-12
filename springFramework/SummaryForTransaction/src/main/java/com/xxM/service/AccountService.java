package com.xxM.service;

import com.xxM.domain.Account;

public interface AccountService {
    void update(Account from, Account to, Double money);

    Account findById(Integer id);
}
