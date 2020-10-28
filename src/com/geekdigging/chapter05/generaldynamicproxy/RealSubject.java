package com.geekdigging.chapter05.generaldynamicproxy;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/10/28
 * @Time: 21:56
 * @email: inwsy@hotmail.com
 * Description:
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething(String string) {
        System.out.println("doSomething----------->str:" + string);
    }
}
