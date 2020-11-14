package com.geekdigging.chapter11.lol;

/**
 * Created with IntelliJ IDEA.
 *
 * 测试类
 *
 * @Date: 2020/11/14
 * @Time: 15:11
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        LOLGame game;
        System.out.println("狗头军师A的点子--------------");
        game = new LOLGame(new DogStrategistA());
        game.play();
        System.out.println("狗头军师B的点子--------------");
        game = new LOLGame(new DogStrategistB());
        game.play();
    }
}
