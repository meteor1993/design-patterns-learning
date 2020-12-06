package com.geekdigging.chapter17.security;

/**
 * 备忘录管理员
 */
public class Caretaker {
    // 备忘录对象
    private IMemento memento;

    public IMemento getMemento() {
        return memento;
    }

    public void setMemento(IMemento memento) {
        this.memento = memento;
    }
}
