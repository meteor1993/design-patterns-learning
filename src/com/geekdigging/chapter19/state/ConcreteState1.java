package com.geekdigging.chapter19.state;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/12/12
 * @Time: 10:32
 * @email: inwsy@hotmail.com
 * Description:
 */
public class ConcreteState1 extends State {
    @Override
    void handle1() {
        //本状态下必须处理的逻辑
    }

    @Override
    void handle2() {
        //设置当前状态为stat2
        super.context.setCurrentState(Context.STATE2);
        //过渡到state2状态， 由Context实现
        super.context.handle2();
    }
}
