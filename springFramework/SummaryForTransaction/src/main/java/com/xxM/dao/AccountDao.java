package com.xxM.dao;

import com.xxM.domain.Account;

public interface AccountDao {
    Integer update(Account account);

    Account findById(Integer id);
}
