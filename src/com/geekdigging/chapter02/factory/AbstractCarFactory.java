package com.geekdigging.chapter02.factory;

public abstract class AbstractCarFactory {
    public abstract  <T extends Car> T createCar(Class<T> clazz);
}
