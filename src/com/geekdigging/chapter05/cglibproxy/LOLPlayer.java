package com.geekdigging.chapter05.cglibproxy;

public class LOLPlayer implements ILOLPlayer {

    private String name;

    public LOLPlayer(String name) {
        this.name = name;
    }

    public LOLPlayer() {

    }

    @Override
    public void login(String name, String password) {
        System.out.println("登录游戏：name：" + name + "， password:" + password);
    }

    @Override
    public void pentaKill() {
        System.out.println(this.name + " 拿到五杀啦！！！");
    }

    @Override
    public void victory() {
        System.out.println(this.name + " 游戏胜利啦！！！");
    }
}
