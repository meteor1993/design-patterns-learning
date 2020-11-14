package com.geekdigging.chapter11.lol;

/**
 * Created with IntelliJ IDEA.
 *
 * @User: weishiyao
 * @Date: 2020/11/14
 * @Time: 14:46
 * @email: inwsy@hotmail.com
 * Description:
 */
public class LOLGame {
    private LOL lol;
    public LOLGame(LOL lol) {
        this.lol = lol;
    }
    public void play() {
        this.lol.playMethod();
    }
}
