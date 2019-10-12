package com.xxM.test;

import com.xxM.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Program: IntelliJ IDEA springFramework
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-09 08:51:05 周三
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
public class FixedTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        accountService.delete();
    }
}
