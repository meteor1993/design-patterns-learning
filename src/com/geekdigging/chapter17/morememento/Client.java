package com.geekdigging.chapter17.morememento;

/**
 * 场景类
 */
public class Client {
    public static void main(String[] args) {
        // 定义发起人
        Originator originator = new Originator();
        // 定义备忘录管理员
        Caretaker caretaker = new Caretaker();
        // 创建两个备忘录
        caretaker.setMemento("001", originator.createMemento());
        caretaker.setMemento("002", originator.createMemento());
        // 恢复一个指定的备忘录
        originator.restoreMemento(caretaker.getMemento("002"));
    }
}
