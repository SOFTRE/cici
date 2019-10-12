package com.xxM.test;

import com.xxM.dao.AccountDao;
import com.xxM.dao.Impl.AccountDaoImpl;
import com.xxM.dao.Impl.AccountDaoImpl02;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Program: IntelliJ IDEA springFramework
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-08 13:24:58 周二
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
public class InitBeanTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
        AccountDao accountDao = applicationContext.getBean("accountDao", AccountDao.class);
        accountDao.save();
        AccountDao accountDao02 = applicationContext.getBean("accountDao02", AccountDao.class);
        accountDao02.save();
        AccountDao accountDao03 = applicationContext.getBean("accountDao03", AccountDao.class);
        accountDao03.save();

    }
}
