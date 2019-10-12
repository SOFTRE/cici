package com.xxm.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @Program: IntelliJ IDEA sp
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-12 21:00:16 周六
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@Aspect
public class Check {
    @Before(value = "execution(* com.xxm.service.impl.AccountServiceImpl.save(..))")
    public static void checkRights() {
        System.out.println(" 检查权限！");
    }

    @AfterReturning(value = "execution(* com.xxm.service.impl.AccountServiceImpl.delete(..))", returning = "object")
    public static void showDeleteLog(Object object) {
        System.out.println(" 删除成功：" + object);
    }

    @Around(value = "execution(* com.xxm.service.impl.AccountServiceImpl.update(..))")
    public static void showTime(ProceedingJoinPoint joinPoint) throws Throwable {
        Long start = System.currentTimeMillis();
        joinPoint.proceed();
        Long end = System.currentTimeMillis();
        System.out.println(" this current cast the time: " + (end - start));
    }

    @AfterThrowing(value = "execution(* com.xxm.service.impl.AccountServiceImpl.findById(..))", throwing = "throwable")
    public static void showThrowable(Throwable throwable) {
        System.out.println(" 产生异常: " + throwable);
    }

    @After(value = "execution(* com.xxm.service.impl.AccountServiceImpl.findAll(..))")
    public static void showFinallyMessage() {
        System.out.println(" this is a end target! ");
    }
}
