package com.geekdigging.chapter02.carFactory;

public class Audi implements Car {
    @Override
    public void name() {
        System.out.println("我是奥迪！！！");
    }

    @Override
    public void drive() {
        System.out.println("我是奥迪，科技感十足！！！");
    }
}
