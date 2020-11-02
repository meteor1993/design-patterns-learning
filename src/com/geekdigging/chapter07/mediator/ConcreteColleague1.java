package com.geekdigging.chapter07.mediator;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/11/2
 * @Time: 22:03
 * @email: inwsy@hotmail.com
 * Description:
 */
public class ConcreteColleague1 extends Colleague{

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod1() {
        // 处理自己的业务逻辑
    }

    public void depMethod1() {
        // 处理自己的业务逻辑
        // 自己处理不了的业务委托中介者进行处理
        super.mediator.doSomething1();
    }
}
