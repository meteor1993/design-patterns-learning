package com.geekdigging.chapter19.lol2;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/12/13
 * @Time: 15:47
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
        Hero hero = new Hero();
        hero.startRun();
        hero.setState(Hero.SPEED_UP);
        Thread.sleep(2000);
        hero.setState(Hero.SPEED_DOWN);
        Thread.sleep(2000);
        hero.setState(Hero.SWIM);
        Thread.sleep(2000);
        hero.stopRun();
    }
}
