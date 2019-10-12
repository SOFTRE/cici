package com.xxM.dao.impl;

import com.xxM.dao.AccountDao;
import com.xxM.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Program: IntelliJ IDEA springFramework
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-11 20:51:53 周五
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@Repository
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void save(Account account) {
        jdbcTemplate.update(" INSERT INTO account(`name`,money)VALUES(?,?)",account.getName(),account.getMoney());
    }

    @Override
    public void update(Account account) {
        jdbcTemplate.update(" UPDATE account SET `name`=?,money=? WHERE id=? ",account.getName(),account.getMoney(),account.getId());
    }

    @Override
    public void delete(Integer id) {
        jdbcTemplate.update(" DELETE * FORM account WHERE id=? ",id);
    }

    @Override
    public Account findById(Integer id) {
        return jdbcTemplate.queryForObject(" SELECT * FROM account WHERE id=? ", new BeanPropertyRowMapper<>(Account.class), id);
    }

    @Override
    public List<Account> findAll() {
        return jdbcTemplate.query(" SELECT * FROM account ", new BeanPropertyRowMapper<>(Account.class));
    }

    @Override
    public Integer count() {
        return jdbcTemplate.queryForObject(" SELECT COUNT(*) FROM account ", Integer.class);
    }
}
