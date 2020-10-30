package com.geekdigging.chapter05.lolproxy;

public class Test {
    public static void main(String[] args) {
        LOLPlayer lolPlayer = new LOLPlayer("geekdigging");
        LOLPlayerProxy proxy = new LOLPlayerProxy(lolPlayer);
        proxy.login("geekdigging", "password");
        proxy.pentaKill();
        proxy.victory();
    }
}
