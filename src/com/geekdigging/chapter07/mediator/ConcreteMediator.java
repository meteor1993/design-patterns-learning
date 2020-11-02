package com.geekdigging.chapter07.mediator;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/11/2
 * @Time: 21:24
 * @email: inwsy@hotmail.com
 * Description:
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void doSomething1() {
        super.colleague1.selfMethod1();
        super.colleague2.selfMethod2();
    }

    @Override
    public void doSomething2() {
        super.colleague1.selfMethod1();
        super.colleague2.selfMethod2();
    }
}
