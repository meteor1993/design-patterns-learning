package com.geekdigging.chapter02.carFactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/10/21
 * @Time: 21:11
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        AbstractCarFactory carFactory = new CarFactory();
        System.out.println("-- 第一辆车生产特斯拉 --");
        Car tesla = carFactory.createCar(Tesla.class);
        tesla.name();
        tesla.drive();

        System.out.println("-- 第二辆车生产奔驰 --");
        Car benz = carFactory.createCar(Benz.class);
        benz.name();
        benz.drive();

        System.out.println("-- 第三辆车生产奥迪 --");
        Car audi = carFactory.createCar(Audi.class);
        audi.name();
        audi.drive();
    }
}
