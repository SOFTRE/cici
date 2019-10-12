package com.xxM.test;

import com.xxM.domain.Account;
import com.xxM.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Program: IntelliJ IDEA springFramework
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-12 10:47:02 周六
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class XmlTransactionTest {
    @Autowired
    private AccountService accountService;
    @Test
    public void testTransaction(){
        Account from=accountService.findById(1);
        Account to=accountService.findById(2);
        accountService.trans(from,to,100.00);
    }
}
