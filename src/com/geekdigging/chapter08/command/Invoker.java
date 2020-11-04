package com.geekdigging.chapter08.command;

/**
 * Created with IntelliJ IDEA.
 *
 * 调用者 Invoker 类
 *
 * @Date: 2020/11/4
 * @Time: 23:41
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }
}
