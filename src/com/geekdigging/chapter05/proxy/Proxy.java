package com.geekdigging.chapter05.proxy;

/**
 * Created with IntelliJ IDEA.
 *
 *
 *
 * @Date: 2020/10/27
 * @Time: 23:51
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Proxy implements Subject {

    private Subject subject;

    public Proxy() {
        this.subject = new Proxy();
    }

    public Proxy(RealSubject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    private void before() {
        // 逻辑预处理
    }

    private void after() {
        // 逻辑善后处理
    }
}
