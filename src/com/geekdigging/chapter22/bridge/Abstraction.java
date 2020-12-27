package com.geekdigging.chapter22.bridge;

/**
 * Created with IntelliJ IDEA.
 *
 * 抽象化角色
 *
 * @Date: 2020/12/27
 * @Time: 1:00
 * @email: inwsy@hotmail.com
 * Description:
 */
public abstract class Abstraction {
    // 定义对实现化角色的引用
    private Implementor impl;
    // 约束子类必须实现该构造函数
    public Abstraction(Implementor impl){
        this.impl = impl;
    }
    // 自身的行为和属性
    public void request(){
        this.impl.doSomething();
    }
    // 获得实现化角色
    public Implementor getImpl(){
        return impl;
    }
}
