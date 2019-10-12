package com.xxM.test;

import com.xxM.dao.AccountDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        /*AccountDao accountDao = applicationContext.getBean("accountDao", AccountDao.class);
        accountDao.save();
        AccountDao accountDao02 = applicationContext.getBean("accountDao02", AccountDao.class);
        accountDao02.save();
        AccountDao accountDao03 = applicationContext.getBean("accountDao03", AccountDao.class);
        accountDao03.save();
        AccountDao accountDao04 = applicationContext.getBean("accountDao04", AccountDao.class);
        accountDao04.save();
        AccountDao accountDao05 = applicationContext.getBean("accountDao05", AccountDao.class);
        accountDao05.save();
        AccountDao accountDao06 = applicationContext.getBean("accountDao06", AccountDao.class);
        accountDao06.save();*/
        AccountDao accountDao07 = applicationContext.getBean("accountDao07", AccountDao.class);
        accountDao07.save();
    }
}
