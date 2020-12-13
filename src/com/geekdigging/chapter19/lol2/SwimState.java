package com.geekdigging.chapter19.lol2;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/12/13
 * @Time: 17:18
 * @email: inwsy@hotmail.com
 * Description:
 */
public class SwimState implements RunState {
    @Override
    public void run(Hero hero) {
        System.out.println("--------------不能跑动---------------");
        try {
            Thread.sleep(1000);//假设眩晕持续1秒
        } catch (InterruptedException e) {}
        hero.setState(Hero.COMMON);
        System.out.println("------眩晕状态结束，变为正常状态------");
    }
}
