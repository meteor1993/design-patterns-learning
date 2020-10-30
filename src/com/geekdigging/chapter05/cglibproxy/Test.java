package com.geekdigging.chapter05.cglibproxy;

public class Test {
    public static void main(String[] args) {
        ILOLPlayer ilolPlayer = new LOLPlayer("geekdigging");
        CglibProxy proxy = new CglibProxy();
        LOLPlayer lolPlayer = (LOLPlayer) proxy.getInstance(ilolPlayer);
        lolPlayer.login("geekdigging", "password");
        lolPlayer.pentaKill();
        lolPlayer.victory();
    }
}
