package com.geekdigging.chapter04.builder;

/**
 * Created with IntelliJ IDEA.
 *
 * @User: weishiyao
 * @Date: 2020/10/25
 * @Time: 21:11
 * @email: inwsy@hotmail.com
 * Description:
 */
public class HelloBike extends AbstractBike {
    @Override
    protected void frame() {
        System.out.println("现在开始生产一个哈罗车架");
    }

    @Override
    protected void seat() {
        System.out.println("现在开始生产一个哈罗座位");
    }

    @Override
    protected void tire() {
        System.out.println("现在开始生产两个哈罗轮胎");
    }
}
