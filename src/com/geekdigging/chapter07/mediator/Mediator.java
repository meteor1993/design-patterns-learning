package com.geekdigging.chapter07.mediator;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/11/2
 * @Time: 21:20
 * @email: inwsy@hotmail.com
 * Description:
 */
public abstract class Mediator {

    protected ConcreteColleague1 colleague1;
    protected ConcreteColleague2 colleague2;

    public ConcreteColleague1 getC1() {
        return colleague1;
    }

    public void setC1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public ConcreteColleague2 getC2() {
        return colleague2;
    }

    public void setC2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }

    public abstract void doSomething1();
    public abstract void doSomething2();
}
