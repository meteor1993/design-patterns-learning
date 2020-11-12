package com.geekdigging.chapter10.decorator;

public class ConcreteDecorator2 extends Decorator {
    public ConcreteDecorator2(Component component) {
        super(component);
    }
    private void method2() {
        System.out.println("method2 修饰");
    }

    @Override
    void operate() {
        super.operate();
        this.method2();
    }
}
