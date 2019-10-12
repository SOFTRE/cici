package com.xxm.service.impl;

import com.xxm.service.AccountService;
import org.springframework.stereotype.Service;

/**
 * @Program: IntelliJ IDEA sp
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-12 20:56:09 周六
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Override
    public void save() {
        System.out.println("AccountServiceImpl-->save()");
    }

    @Override
    public String delete() {
        System.out.println("AccountServiceImpl-->delete()");
        return "delete OK";
    }

    @Override
    public void update() {
        System.out.println("AccountServiceImpl-->update()");

    }

    @Override
    public void findById() {
        System.out.println("AccountServiceImpl-->findById()");

    }

    @Override
    public void findAll() {
        System.out.println("AccountServiceImpl-->findAll()");
    }
}
