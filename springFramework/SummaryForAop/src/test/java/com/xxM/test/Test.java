package com.xxM.test;

import com.xxm.service.AccountService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Program: IntelliJ IDEA sp
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-12 21:25:26 周六
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
    public void save() {
        accountService.save();
    }

    @org.junit.Test
    public void update() {
        accountService.update();
    }

    @org.junit.Test
    public void delete() {
        accountService.delete();
    }

    @org.junit.Test
    public void findById() {
        accountService.findById();
    }

    @org.junit.Test
    public void findAll() {
        accountService.findAll();
    }
}
