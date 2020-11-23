package com.geekdigging.chapter15.observer;

public class Test {
    public static void main(String[] args) {
        // 创建一个被观察者
        ConcreteSubject subject = new ConcreteSubject();
        // 创建一个观察者
        Observer observer = new ConcreteObserver();
        // 观察者观察被观察者
        subject.addObserver(observer);
        // 观察者开始活动了
        subject.doSomething();
    }
}
