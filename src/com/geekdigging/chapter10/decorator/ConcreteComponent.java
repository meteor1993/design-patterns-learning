package com.geekdigging.chapter10.decorator;

/**
 * 具体构建
 */
public class ConcreteComponent extends Component {
    @Override
    void operate() {
        System.out.println("do Something");
    }
}
