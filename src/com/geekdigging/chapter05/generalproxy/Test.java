package com.geekdigging.chapter05.generalproxy;

public class Test {
    public static void main(String[] args) {
        ILOLPlayer proxy = new LOLPlayerProxy("geekdigging");
        proxy.login("geekdigging", "password");
        proxy.pentaKill();
        proxy.victory();
    }
}
