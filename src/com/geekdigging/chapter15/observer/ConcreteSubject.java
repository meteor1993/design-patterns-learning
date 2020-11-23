package com.geekdigging.chapter15.observer;

/**
 * 具体的被观察者
 */
public class ConcreteSubject extends Subject {
    public void doSomething() {
        // 具体的业务
        super.notifyObservers();
    }
}
