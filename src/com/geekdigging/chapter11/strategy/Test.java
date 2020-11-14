package com.geekdigging.chapter11.strategy;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/11/14
 * @Time: 13:17
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategy1();
        Context context = new Context(strategy);
        context.doAnything();
    }
}
