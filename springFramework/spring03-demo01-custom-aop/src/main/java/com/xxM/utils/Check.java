package com.xxM.utils;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Program: IntelliJ IDEA springFramework
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-10 20:57:58 周四
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
public class Check {
    public static void checkRights(){
        System.out.println("检查权限！");
    }
    public static void showDeleteLog(Object object){
        System.out.println("删除成功-->"+object);
    }
    public void showTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Long begin=System.currentTimeMillis();
        System.out.println("begin="+begin);
        proceedingJoinPoint.proceed();
        Long end=System.currentTimeMillis();
        System.out.println("end="+end);
        System.out.println("cast time is :"+(end-begin));
    }
    public void showException(Throwable throwable){
        System.out.println("只是一个异常信息："+throwable.getMessage());
    }
    public void showFinalMsg(){
        System.out.println(" this is a final msg ");
    }
}

