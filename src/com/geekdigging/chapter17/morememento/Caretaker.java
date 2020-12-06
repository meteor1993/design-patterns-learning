package com.geekdigging.chapter17.morememento;

import java.util.HashMap;
import java.util.Map;

/**
 * 备忘录管理员
 */
public class Caretaker {
    // 容纳备忘录的容器
    private Map<String, Memento> mementoMap = new HashMap<>();

    public Memento getMemento(String keys) {
        return mementoMap.get(keys);
    }

    public void setMemento(String key, Memento memento) {
        this.mementoMap.put(key, memento);
    }
}
