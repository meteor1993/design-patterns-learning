package com.geekdigging.chapter01.single;

/**
 * Created with IntelliJ IDEA.
 *
 * 懒汉式单例模式——方发锁
 *
 * @Date: 2020/10/19
 * @Time: 23:58
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Singleton1 {
    private static Singleton1 singleton1 = null;

    private Singleton1() {
    }

    public static synchronized Singleton1 getInstance() {
        if (singleton1 == null) {
            singleton1 = new Singleton1();
        }
        return singleton1;
    }
}
