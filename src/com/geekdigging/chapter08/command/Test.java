package com.geekdigging.chapter08.command;

/**
 * Created with IntelliJ IDEA.
 *
 * 测试类
 *
 * @Date: 2020/11/4
 * @Time: 23:42
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        // 定义接受者
        Receiver receiver = new ConcreteReceiver1();
        // 定义一个发送给接收者的命令
        Command command = new ConcreteCommand1(receiver);
        // 把命令交给调用者去执行
        invoker.setCommand(command);
        invoker.action();
    }
}
