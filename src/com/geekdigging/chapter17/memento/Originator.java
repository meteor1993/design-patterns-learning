package com.geekdigging.chapter17.memento;

/**
 * 发起人
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    // 创建一个备忘录
    public Memento createMemento() {
        return new Memento(this.state);
    }
    // 恢复一个备忘录
    public void restoreMemento(Memento memento) {
        this.setState(memento.getState());
    }
}
