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
    // 定义同事类
    protected ConcreteColleague1 colleague1;
    protected ConcreteColleague2 colleague2;

    // 通过 get/set 将同事注入进来
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

    // 中介者模式的业务逻辑
    public abstract void doSomething1();
    public abstract void doSomething2();
}
