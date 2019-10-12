package com.xxM.test;

import com.xxM.domain.Account;
import com.xxM.service.AccountService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Program: IntelliJ IDEA sp
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-12 19:16:32 周六
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Test {
    @Autowired
    private AccountService accountService;

    @org.junit.Test
    public void transactionTest() {
        Account from = accountService.findById(1);
        Account to = accountService.findById(2);
        accountService.update(from, to, 100.00);
    }
}
