package com.geekdigging.chapter02.factory;

public class CarFactory extends AbstractCarFactory {
    @Override
    public <T extends Car> T createCar(Class<T> clazz) {
        
        return null;
    }
}
