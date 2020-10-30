package com.geekdigging.chapter05.compelproxy;

public class Test {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    public static void test1() {
        ILOLPlayer iloLPlayer = new LOLPlayer("geekdigging");
        iloLPlayer.login("geekdigging", "password");
        iloLPlayer.pentaKill();
        iloLPlayer.victory();
    }

    public static void test2() {
        ILOLPlayer iloLPlayer = new LOLPlayer("geekdigging");
        ILOLPlayer proxy = new LOLPlayerProxy(iloLPlayer);
        proxy.login("geekdigging", "password");
        proxy.pentaKill();
        proxy.victory();
    }

    public static void test3() {
        ILOLPlayer iloLPlayer = new LOLPlayer("geekdigging");
        ILOLPlayer proxy = iloLPlayer.getProxy();
        proxy.login("geekdigging", "password");
        proxy.pentaKill();
        proxy.victory();
    }
}
