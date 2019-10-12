package com.xxM.test;

import com.xxM.dao.AccountDao;
import com.xxM.service.AccountService;
import com.xxM.service.Impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Program: IntelliJ IDEA springFramework
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-08 10:27:14 周二
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
public class IocTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//        AccountDao accountDao = applicationContext.getBean("accountDao", AccountDao.class);
//        accountDao.save();
//        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
//        accountService.save();
    }
}
