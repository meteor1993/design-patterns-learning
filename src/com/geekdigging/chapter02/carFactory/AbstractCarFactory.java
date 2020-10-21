package com.geekdigging.chapter02.carFactory;

public abstract class AbstractCarFactory {
    public abstract  <T extends Car> T createCar(Class<T> clazz);
}
