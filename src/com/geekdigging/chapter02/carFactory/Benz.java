package com.geekdigging.chapter02.carFactory;

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
