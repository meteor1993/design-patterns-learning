package com.geekdigging.chapter22.bridge;

/**
 * Created with IntelliJ IDEA.
 *
 * 场景类
 *
 * @Date: 2020/12/27
 * @Time: 1:02
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        // 定义一个实现化角色
        Implementor imp = new ConcreteImplementor1();
        // 定义一个抽象化角色
        Abstraction abs = new RefinedAbstraction(imp);
        // 执行行文
        abs.request();
    }
}
