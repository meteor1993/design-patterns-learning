package com.geekdigging.chapter18.visitor;

public class ConcreteElement2 extends Element{
    @Override
    void doSomething() {

    }

    @Override
    void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
