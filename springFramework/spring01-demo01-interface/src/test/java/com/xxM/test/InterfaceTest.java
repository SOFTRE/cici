package com.xxM.test;

import com.xxM.service.AccountService;
import com.xxM.service.Impl.AccountServiceImpl;

/**
 * @Program: IntelliJ IDEA springFramework
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-07 21:37:21 周一
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
public class InterfaceTest {
    public static void main(String[] args) {
        AccountService accountService=new AccountServiceImpl();
        accountService.update();
    }
}
