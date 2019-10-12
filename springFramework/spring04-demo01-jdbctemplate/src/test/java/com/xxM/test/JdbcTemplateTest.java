package com.xxM.test;

import com.xxM.domain.Account;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

/**
 * @Program: IntelliJ IDEA springFramework
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-11 20:02:52 周五
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
public class JdbcTemplateTest {
    private JdbcTemplate jdbcTemplate;

    @Before
    public void before() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/java76");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("123456");
        jdbcTemplate = new JdbcTemplate(driverManagerDataSource);
    }

    @Test
    public void findAll() {
        List<Account> accountList = jdbcTemplate.query("SELECT * FROM account", new BeanPropertyRowMapper<>(Account.class));
        for (Account account : accountList) {
            System.out.println(account);
        }
    }

    @Test
    public void save() {
        jdbcTemplate.update(" INSERT INTO account (name,money) VALUES(?,?) ", "zl", "10001");

    }

    @Test
    public void update() {
        jdbcTemplate.update(" UPDATE account SET `name`=?,money=? WHERE id=? ", "zl_76", "20001.00", 4);
    }

    @Test
    public void delete() {
        jdbcTemplate.update(" DELETE FROM account WHERE id=? ", 4);
    }

    @Test
    public void findById() {
        Account account = jdbcTemplate.queryForObject(" SELECT * FROM account WHERE id=? ", new BeanPropertyRowMapper<>(Account.class), 3);
        System.out.println(account);
    }
    @Test
    public void findCount(){
        Integer count=jdbcTemplate.queryForObject(" SELECT COUNT(*) FROM account ",Integer.class);
        System.out.println(count);
    }

}

