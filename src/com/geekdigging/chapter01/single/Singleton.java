package com.geekdigging.chapter01.single;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/10/19
 * @Time: 23:48
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}