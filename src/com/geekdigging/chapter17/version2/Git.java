package com.geekdigging.chapter17.version2;

/**
 * 版本管理工具 Git
 */
public class Git {
    private String state;
    // 版本发生改变，现在是 version2
    public void changeState() {
        this.state = "version2";
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    // 创建一个备忘录
    public Memento createMemento(String state) {
        return new Memento(state);
    }
    // 恢复一个备忘录
    public void restoreMemento(Memento memento) {
        this.setState(memento.getState());
    }
}
