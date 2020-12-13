package com.geekdigging.chapter19.state;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/12/12
 * @Time: 10:32
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Context {
    final static State STATE1 = new ConcreteState1();
    final static State STATE2 = new ConcreteState2();

    private State concreteState;

    public State getCurrentState() {
        return concreteState;
    }
    //设置当前状态
    public void setCurrentState(State currentState) {
        this.concreteState = currentState;
        //切换状态
        this.concreteState.setContext(this);
    }
    public void handle1(){
        this.concreteState.handle1();
    }
    public void handle2(){
        this.concreteState.handle2();
    }
}
