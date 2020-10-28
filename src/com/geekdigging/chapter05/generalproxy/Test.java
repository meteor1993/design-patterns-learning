package com.geekdigging.chapter05.generalproxy;

public class Test {
    public static void main(String[] args) {
        ILOLPlayer proxy = new LOLPlayerProxy("张三");
        proxy.login("zhangsan", "password");
        proxy.pentaKill();
        proxy.victory();
    }
}
