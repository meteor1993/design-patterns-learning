package com.geekdigging.chapter07.mediator;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/11/2
 * @Time: 22:04
 * @email: inwsy@hotmail.com
 * Description:
 */
public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod2() {
        // 处理自己的业务逻辑
    }

    public void depMethod2() {
        // 处理自己的业务逻辑
        // 自己处理不了的业务委托中介者进行处理
        super.mediator.doSomething2();
    }
}
