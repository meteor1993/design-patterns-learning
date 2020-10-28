package com.geekdigging.chapter05.generaldynamicproxy;

import java.lang.reflect.InvocationHandler;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/10/28
 * @Time: 22:07
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        InvocationHandler invocationHandler = new MyInvocationHandler(subject);
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), invocationHandler);
        proxy.doSomething("doSomething");
    }
}
