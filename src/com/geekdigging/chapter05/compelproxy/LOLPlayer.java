package com.geekdigging.chapter05.compelproxy;

public class LOLPlayer implements ILOLPlayer {

    private String name;

    private ILOLPlayer proxy;

    public LOLPlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String name, String password) {
        if (this.isProxy()) {
            System.out.println("登录游戏：name：" + name + "， password:" + password);
        } else {
            System.out.println("请使用指定的代理");
        }

    }

    @Override
    public void pentaKill() {
        if (this.isProxy()) {
            System.out.println(this.name + " 拿到五杀啦！！！");
        } else {
            System.out.println("请使用指定的代理");
        }
    }

    @Override
    public void victory() {
        if (this.isProxy()) {
            System.out.println(this.name + " 游戏胜利啦！！！");
        } else {
            System.out.println("请使用指定的代理");
        }
    }

    @Override
    public ILOLPlayer getProxy() {
        this.proxy = new LOLPlayerProxy(this);
        return this.proxy;
    }

    private boolean isProxy() {
        if (this.proxy == null) {
            return false;
        } else {
            return true;
        }
    }
}
