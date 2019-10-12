package com.xxM.dao;

import com.xxM.domain.Account;

import java.util.List;

public interface AccountDao {
    void save(Account account);

    void update(Account account);

    void delete(Integer id);

    Account findById(Integer id);

    List<Account> findAll();

    Integer count();
}
