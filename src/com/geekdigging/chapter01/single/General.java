package com.geekdigging.chapter01.single;

/**
 * Created with IntelliJ IDEA.
 *
 * 饿汉式单例模式
 *
 * @Date: 2020/10/19
 * @Time: 23:10
 * @email: inwsy@hotmail.com
 * Description:
 */
public class General {
    // 初始化一个将军
    private static final General general = new General();

    // 构造函数私有化
    private General() {

    }

    public static General getInstance() {
        return general;
    }

    public void command() {
        System.out.println("将军下令，兄弟们跟我上啊！！！");
    }
}
