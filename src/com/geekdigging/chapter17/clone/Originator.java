package com.geekdigging.chapter17.clone;

import com.geekdigging.chapter17.memento.Memento;

/**
 * 发起人
 */
public class Originator implements Cloneable {
    // 内部状态
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private Originator backup;

    // 创建一个备忘录
    public void createMemento() {
        this.backup = this.clone();
    }
    // 恢复一个备忘录
    public void restoreMemento() {
        this.setState(this.backup.getState());
    }
    // 克隆当前对象
    @Override
    protected Originator clone() {
        try {
            return (Originator) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
