package com.geekdigging.chapter10.decorator;

public class ConcreteDecorator1 extends Decorator {
    // 定义被修饰者
    public ConcreteDecorator1(Component component) {
        super(component);
    }
    private void method1() {
        System.out.println("method1 修饰");
    }

    @Override
    void operate() {
        this.method1();
        super.operate();
    }
}
