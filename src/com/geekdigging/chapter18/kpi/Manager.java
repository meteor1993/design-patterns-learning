package com.geekdigging.chapter18.kpi;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/12/11
 * @Time: 22:52
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Manager extends Staff {
    public Manager(String name) {
        super(name);
    }
    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
    // 一年做的产品数量
    public int getProducts() {
        return new Random().nextInt(10);
    }
}
