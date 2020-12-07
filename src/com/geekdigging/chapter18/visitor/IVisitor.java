package com.geekdigging.chapter18.visitor;

public interface IVisitor {
    void visit(ConcreteElement1 ele1);
    void visit(ConcreteElement2 ele2);
}
