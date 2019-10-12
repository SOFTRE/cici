package com.xxM.service;

import com.xxM.domain.Account;

import java.util.List;

public interface AccountService {
    void save(Account account);

    void update(Account account);

    void delete(Integer id);

    Account findById(Integer id);

    List<Account> findAll();

    Integer count();
    void trans(Account from,Account to,Double money);
}
