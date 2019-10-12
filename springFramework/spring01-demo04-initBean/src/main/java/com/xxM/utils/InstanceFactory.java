package com.xxM.utils;

import com.xxM.dao.Impl.AccountDaoImpl03;

/**
 * @Program: IntelliJ IDEA springFramework
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-08 13:42:39 周二
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
public class InstanceFactory {
    public Object getBean(){
        return new AccountDaoImpl03();
    }
}
