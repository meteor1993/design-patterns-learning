package com.geekdigging.chapter15.observer;

/**
 * 具体的观察者
 */
public class ConcreteObserver implements Observer{
    @Override
    public void update() {
        System.out.println("进行消息处理");
    }
}
