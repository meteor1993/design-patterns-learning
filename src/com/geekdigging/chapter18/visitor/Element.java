package com.geekdigging.chapter18.visitor;

/**
 * 抽象元素
 */
public abstract class Element {
    // 定义业务逻辑
    abstract void doSomething();
    // 定义允许访问角色
    abstract void accept(IVisitor visitor);
}
