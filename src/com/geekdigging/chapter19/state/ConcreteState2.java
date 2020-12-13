package com.geekdigging.chapter19.state;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/12/12
 * @Time: 12:00
 * @email: inwsy@hotmail.com
 * Description:
 */
public class ConcreteState2 extends State {
    @Override
    void handle1() {
        //设置当前状态为stat2
        super.context.setCurrentState(Context.STATE1);
        //过渡到state2状态， 由Context实现
        super.context.handle1();
    }

    @Override
    void handle2() {
        // 本状态下必须处理的逻辑
    }
}
