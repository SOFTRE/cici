package com.xxM.service.impl;

import com.xxM.dao.AccountDao;
import com.xxM.service.AccountService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Program: IntelliJ IDEA springFramework
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-09 08:41:36 周三
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@Service(value = "accountService")
public class AccountServiceImpl implements AccountService {
    @Value(value = "张飞")
    private String username;
    @Value(value = "100")
    private Integer age;
    @Resource(name = "accountDao")
    private AccountDao accountDao;
    @Override
    public void delete() {
        accountDao.delete();
        System.out.println("AccountServiceImpl-->delete()");
    }
}
