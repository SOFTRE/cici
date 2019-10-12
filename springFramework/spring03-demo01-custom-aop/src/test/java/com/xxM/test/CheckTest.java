package com.xxM.test;

import com.xxM.dao.AccountDao;
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
 * @CreateDate: 2019-10-10 21:27:06 周四
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class CheckTest {
    @Autowired
    private AccountDao accountDao;
    @Test
    public void before(){
    accountDao.save();
    }
    @Test
    public void after(){
    accountDao.delete();
    }
    @Test
    public void findAll(){
    accountDao.findAll();
    }
    @Test
    public void findById(){
        accountDao.findById();
    }
    @Test
    public void method(){
        accountDao.update();
    }
}
