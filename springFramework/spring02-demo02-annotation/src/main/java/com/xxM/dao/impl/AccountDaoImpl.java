package com.xxM.dao.impl;

import com.xxM.dao.AccountDao;
import com.xxM.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @Program: IntelliJ IDEA springFramework
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-08 22:02:18 周二
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@Repository("accountDao")
@Scope("singleton")
public class AccountDaoImpl implements AccountDao {
    @Value("张三")
    private String username;
    @Value("25")
    private Integer age;
//    @Autowired
//    @Qualifier("accountServiceImpl")
    @Resource(name = "accountServiceImpl")
    private AccountService accountService;
    @PostConstruct
    public void initMethod(){
        System.out.println("AccountDaoImpl--->initMethod()");
    }
    @Override
    public void delete() {

        accountService.delete();
    System.out.println("AccountDaoImpl-->delete()::"+username+":::"+age);
    }
    @PreDestroy//对象销毁前执行
    public void destroy(){
        System.out.println("AccountDaoImpl--->destroy()");
    }
}
