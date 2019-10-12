package com.xxM.dao.Impl;

import com.xxM.dao.AccountDao;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Program: IntelliJ IDEA springFramework
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-08 13:59:22 周二
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
public class AccountDaoImpl04 implements AccountDao {
    private Map<String,String> map;

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public void save() {
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() +"--->"+ entry.getValue());
        }
        System.out.println("AccountDaoImpl04--->save()");
    }
}
