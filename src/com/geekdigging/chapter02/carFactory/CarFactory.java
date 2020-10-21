package com.geekdigging.chapter02.carFactory;

public class CarFactory extends AbstractCarFactory {
    @Override
    public <T extends Car> T createCar(Class<T> clazz) {
        Car car = null;
        try {
            car = (T)Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("汽车生产出错啦，请回炉重造！");
        }
        return (T) car;
    }
}
