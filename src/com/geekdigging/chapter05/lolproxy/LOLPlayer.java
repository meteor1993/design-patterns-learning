package com.geekdigging.chapter05.lolproxy;

/**
 * Created with IntelliJ IDEA.
 *
 * 游戏者
 *
 * @Date: 2020/10/27
 * @Time: 23:32
 * @email: inwsy@hotmail.com
 * Description:
 */
public class LOLPlayer implements ILOLPlayer {

    private String name = "";

    public LOLPlayer(String name) {
        this.name = name;
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
