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
 * @CreateDate: 2019-10-11 09:09:40 周五
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AnnotationAdviceTest {
    @Autowired
    private AccountDao accountDao;
    @Test
    public void method(){
        accountDao.save();
    }
}
