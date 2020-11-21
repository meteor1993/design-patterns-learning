package com.geekdigging.chapter14.demo3;

import java.util.Collection;

/**
 * 安全模式
 */
public abstract class Component {
    // 输出组件名称
    abstract void printStruct(String preStr);

    // 向组合对象中加入组件对象
    abstract void addChild(Component child);

    // 从组合对象中移出某个组件对象
    abstract void removeChild(Component child);

    // 返回组件对象
    abstract Collection getChildren();
}
