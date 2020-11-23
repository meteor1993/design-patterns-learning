package com.geekdigging.chapter15.observer;

import java.util.Vector;

/**
 * 被观察者
 */
public abstract class Subject {
    // 定义一个观察者数组
    private Vector<Observer> obsVector = new Vector<>();
    // 添加一个观察者
    public void addObserver(Observer obsVector) {
        this.obsVector.add(obsVector);
    }
    // 删除一个观察者
    public void delObserver(Observer observer) {
        this.obsVector.remove(observer);
    }
    // 通知所有观察者
    public void notifyObservers() {
        for (Observer obs : this.obsVector) {
            obs.update();
        }
    }
}
