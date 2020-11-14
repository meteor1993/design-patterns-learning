package com.geekdigging.chapter11.strategy;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/11/14
 * @Time: 13:13
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Context {
    private Strategy strategy;
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public void doAnything() {
        this.strategy.doSomethinging();
    }
}
