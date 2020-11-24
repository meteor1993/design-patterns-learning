package com.geekdigging.chapter15.teacher;

public abstract class Observer {
    abstract void update(Object args);
    // 身份
    public String identity;
    public Observer(String identity) {
        this.identity = identity;
    }

    abstract String getIdentity();
}
