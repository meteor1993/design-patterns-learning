package com.geekdigging.chapter08.command;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/11/4
 * @Time: 23:38
 * @email: inwsy@hotmail.com
 * Description:
 */
public class ConcreteCommand2 extends Command {

    private Receiver receiver;

    public ConcreteCommand2(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
