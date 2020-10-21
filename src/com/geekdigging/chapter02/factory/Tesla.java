package com.geekdigging.chapter02.factory;

public class Tesla implements Car {
    @Override
    public void name() {
        System.out.println("我是特斯拉！！！");
    }

    @Override
    public void drive() {
        System.out.println("我是特斯拉，速度贼快！！！");
    }
}
