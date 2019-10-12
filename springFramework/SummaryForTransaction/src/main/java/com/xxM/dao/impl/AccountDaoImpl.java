package com.xxM.dao.impl;

import com.xxM.dao.AccountDao;
import com.xxM.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Program: IntelliJ IDEA sp
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-12 18:47:34 周六
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@Repository
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Integer update(Account account) {
        String sql = " UPDATE account set `name`=?,money= ? WHERE id=? ";
        return jdbcTemplate.update(sql, account.getName(), account.getMoney(), account.getId());
    }

    @Override
    public Account findById(Integer id) {
        String sql = " SELECT * FROM account WHERE id=? ";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Account.class), id);
    }
}
