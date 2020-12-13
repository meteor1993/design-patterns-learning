package com.geekdigging.chapter19.state;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/12/13
 * @Time: 17:09
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        //定义环境角色
        Context context = new Context();
        //初始化状态
        context.setCurrentState(new ConcreteState1());
        //行为执行
        context.handle1();
        context.handle2();
    }
}
