package com.geekdigging.chapter01.single;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/10/20
 * @Time: 0:20
 * @email: inwsy@hotmail.com
 * Description:
 */
public class General1 {
    // 定义最多能产生的将军数量
    private static int maxNumOfGeneral1 = 3;

    // 定义一个列表，存放所有将军的名字
    private static ArrayList<String> nameList = new ArrayList<> ();

    // 定义一个列表，容纳所有的将军实例
    private static ArrayList<General1> general1ArrayList = new ArrayList<> ();

    // 定义当前将军序号
    private static int countNumOfGeneral1 = 0;

    // 在静态代码块中产生所有的将军
    static {
        for (int i = 0; i < maxNumOfGeneral1; i++) {
            general1ArrayList.add(new General1(String.valueOf(i)));
        }
    }

    private General1() {
        // 目的是不产生将军
    }

    private General1(String name) {
        // 给将军加个名字，建立一个将军对象
        nameList.add(name);
    }

    public static General1 getInstance() {
        // 随机产生一个将军，只要能发号施令就成
        Random random = new Random();
        countNumOfGeneral1 = random.nextInt(maxNumOfGeneral1);
        return general1ArrayList.get(countNumOfGeneral1);
    }

    public void command() {
        System.out.println("将军说：我是 " + nameList.get(countNumOfGeneral1) + " 号将军");
    }
}
