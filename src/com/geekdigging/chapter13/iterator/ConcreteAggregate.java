package com.geekdigging.chapter13.iterator;

import java.util.Vector;

public class ConcreteAggregate implements Aggregate {

    private Vector vector = new Vector();

    @Override
    public void add(Object o) {
        this.vector.add(o);
    }

    @Override
    public void remove(Object o) {
        this.vector.remove(o);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(vector);
    }
}
