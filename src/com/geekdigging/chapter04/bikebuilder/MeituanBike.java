package com.geekdigging.chapter04.bikebuilder;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/10/25
 * @Time: 23:52
 * @email: inwsy@hotmail.com
 * Description:
 */
public class MeituanBike extends AbstractBike {
    @Override
    protected void frame() {
        System.out.println("现在开始生产一个美团车架");
    }

    @Override
    protected void seat() {
        System.out.println("现在开始生产一个美团座位");
    }

    @Override
    protected void tire() {
        System.out.println("现在开始生产两个美团轮胎");
    }
}
