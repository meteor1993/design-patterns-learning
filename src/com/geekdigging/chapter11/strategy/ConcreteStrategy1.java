package com.geekdigging.chapter11.strategy;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/11/14
 * @Time: 13:13
 * @email: inwsy@hotmail.com
 * Description:
 */
public class ConcreteStrategy1 implements Strategy {
    @Override
    public void doSomethinging() {
        System.out.println("具体策略1");
    }
}
