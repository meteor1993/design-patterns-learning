package com.geekdigging.chapter05.generaldynamicproxy;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/10/28
 * @Time: 22:01
 * @email: inwsy@hotmail.com
 * Description:
 */
public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("前置方法被执行了！！！！！！！");
    }
}
