package com.geekdigging.chapter03.template;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/10/24
 * @Time: 23:27
 * @email: inwsy@hotmail.com
 * Description:
 */
public abstract class AbstractClass {
    // 基本方法
    protected abstract void doSomething();
    // 基本方法
    protected abstract void doAnything();
    // 模板方法
    public final void templateMethod() {
        this.doSomething();
        this.doAnything();
    }
}
