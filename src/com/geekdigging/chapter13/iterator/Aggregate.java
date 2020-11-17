package com.geekdigging.chapter13.iterator;

public interface Aggregate {
    void add(Object o);
    void remove(Object o);
    Iterator iterator();
}
