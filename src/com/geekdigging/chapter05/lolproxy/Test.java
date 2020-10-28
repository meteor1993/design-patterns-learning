package com.geekdigging.chapter05.lolproxy;

public class Test {
    public static void main(String[] args) {
        LOLPlayer lolPlayer = new LOLPlayer("张三");
        LOLPlayerProxy proxy = new LOLPlayerProxy(lolPlayer);
        proxy.login("zhangsan", "password");
        proxy.pentaKill();
        proxy.victory();
    }
}
