package com.xxM.test;

import com.xxM.dao.AccountDao;
import com.xxM.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ExtendsJdbcTemplateTest {

    /**
     * 1优先按照类型和属性名称去IOC容器里面查找
     * 2按照类型去IOC容器里面查找
     */
    @Autowired
    private AccountDao accountDao03;
    @Test
    public void findAll() {
        List<Account> accountList = accountDao03.findAll();
        for (Account account : accountList) {
            System.out.println(account);
        }
    }
}

