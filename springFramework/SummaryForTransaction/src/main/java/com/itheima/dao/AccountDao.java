package com.itheima.dao;

import com.itheima.domain.Account;

public interface AccountDao {
    Integer update(Account account);

    Account findById(Integer id);
}
