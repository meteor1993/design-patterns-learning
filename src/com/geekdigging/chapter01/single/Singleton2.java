package com.geekdigging.chapter01.single;

/**
 * Created with IntelliJ IDEA.
 *
 * 懒汉式单例模式——同步代码块
 *
 * @Date: 2020/10/20
 * @Time: 0:08
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Singleton2 {
    private static volatile Singleton2 singleton2;

    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {
        // 第一层检查，检查是否有引用指向对象，高并发情况下会有多个线程同时进入
        if(singleton2 == null) {
            // 第一层锁，保证只有一个线程进入
            synchronized (Singleton2.class) {
                // 第二层检查
                if (singleton2 == null) {
                    // volatile 关键字作用为禁止指令重排，保证返回 Singleton 对象一定在创建对象后
                    singleton2 = new Singleton2();
                }
            }
        }
        return singleton2;
    }
}