package com.xxM.dao;

/**
 * @Program: IntelliJ IDEA springFramework
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-10 20:53:46 周四
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 *
 *
 * 连接点:可以被增强的方法
 * 切入点：真正被增强的方法
 * 通知：增强的具体业务逻辑
 * 切面：切入点+通知
 *
 */
public interface AccountDao {
    void save();
    void update();
    String delete();
    void findById();
    void findAll();
}
