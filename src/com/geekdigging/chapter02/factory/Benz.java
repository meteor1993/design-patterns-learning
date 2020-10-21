package com.geekdigging.chapter02.factory;

public class Benz implements Car {
    @Override
    public void name() {
        System.out.println("我是奔驰！！！");
    }

    @Override
    public void drive() {
        System.out.println("我是奔驰，内饰豪华！！！");
    }
}
