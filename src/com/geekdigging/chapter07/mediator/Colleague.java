package com.geekdigging.chapter07.mediator;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/11/2
 * @Time: 21:24
 * @email: inwsy@hotmail.com
 * Description:
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
