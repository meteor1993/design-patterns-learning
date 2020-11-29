package com.geekdigging.chapter15.wechat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * 发布者类（目标，被观察对象）
 *
 * @Date: 2020/11/29
 * @Time: 17:24
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Publisher {
    private List<Subscriber> subscribers;
    private boolean pubStatus = false;

    public Publisher() {
        subscribers = new ArrayList<>();
    }

    protected void subscribe(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    protected void unsubscribe(Subscriber subscriber) {
        if (this.subscribers.contains(subscriber)) {
            this.subscribers.remove(subscriber);
        }
    }

    protected void notifySubscribers(String publisher, String articleName) {
        if (this.pubStatus == false) {
            return;
        }
        for (Subscriber subscriber : this.subscribers) {
            subscriber.receive(publisher, articleName);
        }
        this.clearPubStatus();
    }

    protected void setPubStatus() {
        this.pubStatus = true;
    }

    protected void clearPubStatus() {
        this.pubStatus = false;
    }
}
