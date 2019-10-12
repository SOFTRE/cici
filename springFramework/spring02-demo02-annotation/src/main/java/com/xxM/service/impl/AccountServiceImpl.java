package com.xxM.service.impl;

import com.xxM.service.AccountService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Program: IntelliJ IDEA springFramework
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-08 22:02:36 周二
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@Service("accountServiceImpl")
public class AccountServiceImpl implements AccountService {
    @Override
    public void delete() {
        System.out.println("AccountServiceImpl01-->delete()");
    }
}
