package com.geekdigging.chapter05.compelproxy;

public class Test {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    public static void test1() {
        ILOLPlayer iloLPlayer = new LOLPlayer("张三");
        iloLPlayer.login("zhangsan", "password");
        iloLPlayer.pentaKill();
        iloLPlayer.victory();
    }

    public static void test2() {
        ILOLPlayer iloLPlayer = new LOLPlayer("张三");
        ILOLPlayer proxy = new LOLPlayerProxy(iloLPlayer);
        proxy.login("zhangsan", "password");
        proxy.pentaKill();
        proxy.victory();
    }

    public static void test3() {
        ILOLPlayer iloLPlayer = new LOLPlayer("张三");
        ILOLPlayer proxy = iloLPlayer.getProxy();
        proxy.login("zhangsan", "password");
        proxy.pentaKill();
        proxy.victory();
    }
}
