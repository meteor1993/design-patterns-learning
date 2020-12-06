package com.geekdigging.chapter17.security;

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
    public IMemento createMemento() {
        return new Memento(this.state);
    }
    // 恢复一个备忘录
    public void restoreMemento(IMemento memento) {
        this.setState(((Memento)memento).getState());
    }

    private class Memento implements IMemento {
        private String state;
        private Memento(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }
}
