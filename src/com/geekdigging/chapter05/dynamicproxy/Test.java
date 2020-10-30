package com.geekdigging.chapter05.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        ILOLPlayer ilolPlayer = new LOLPlayer("geekdigging");
        InvocationHandler handler = new LOLPlayIH(ilolPlayer);
        ClassLoader loader = ilolPlayer.getClass().getClassLoader();
        ILOLPlayer proxy = (ILOLPlayer) Proxy.newProxyInstance(loader, new Class[] {ILOLPlayer.class}, handler);
        proxy.login("geekdigging", "password");
        proxy.pentaKill();
        proxy.victory();
    }
}
