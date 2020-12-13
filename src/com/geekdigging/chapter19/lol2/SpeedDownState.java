package com.geekdigging.chapter19.lol2;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/12/13
 * @Time: 17:17
 * @email: inwsy@hotmail.com
 * Description:
 */
public class SpeedDownState implements RunState{
    @Override
    public void run(Hero hero) {
        System.out.println("--------------减速跑动---------------");
        try {
            Thread.sleep(2000);//假设减速持续2秒
        } catch (InterruptedException e) {}
        hero.setState(Hero.COMMON);
        System.out.println("------减速状态结束，变为正常状态------");
    }
}
