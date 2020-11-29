package com.geekdigging.chapter15.jdk;

/**
 * Created with IntelliJ IDEA.
 *
 * 订阅者接口（观察者）
 *
 * @Date: 2020/11/29
 * @Time: 17:21
 * @email: inwsy@hotmail.com
 * Description:
 */
public interface Subscriber {
    void receive(String publisher, String articleName);
}
