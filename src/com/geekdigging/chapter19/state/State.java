package com.geekdigging.chapter19.state;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/12/12
 * @Time: 10:31
 * @email: inwsy@hotmail.com
 * Description:
 */
public abstract class State {
    // 定义一个环境角色，提供子类访问
    protected Context context;
    // 设置环境资源
    public void setContext(Context context) {
        this.context = context;
    }
    // 行为1
    abstract void handle1();
    // 行为2
    abstract void handle2();
}
