package com.xxM.dao.impl;

import com.xxM.dao.AccountDao;
import com.xxM.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
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
@Repository("accountDao02")
public class AccountDaoImpl02 extends JdbcDaoSupport implements AccountDao {
    @Autowired
    private DriverManagerDataSource dataSource;
    @PostConstruct
    public void initDataSource(){
        super.setDataSource(this.dataSource);
    }
    @Override
    public void save(Account account) {
        super.getJdbcTemplate().update(" INSERT INTO account(`name`,money)VALUES(?,?)",account.getName(),account.getMoney());
    }

    @Override
    public void update(Account account) {
        super.getJdbcTemplate().update(" UPDATE account SET `name`=?,money=? WHERE id=? ",account.getName(),account.getMoney(),account.getId());
    }

    @Override
    public void delete(Integer id) {
        super.getJdbcTemplate().update(" DELETE * FORM account WHERE id=? ",id);
    }

    @Override
    public Account findById(Integer id) {
        return super.getJdbcTemplate().queryForObject(" SELECT * FROM account WHERE id=? ", new BeanPropertyRowMapper<>(Account.class), 1);
    }

    @Override
    public List<Account> findAll() {
        return super.getJdbcTemplate().query(" SELECT * FROM account ", new BeanPropertyRowMapper<>(Account.class));
    }

    @Override
    public Integer count() {
        return super.getJdbcTemplate().queryForObject(" SELECT COUNT(*) FROM account ", Integer.class);
    }
}
