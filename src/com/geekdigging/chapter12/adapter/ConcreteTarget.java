package com.geekdigging.chapter12.adapter;

/**
 * 具体目标角色实现
 */
public class ConcreteTarget implements Target{
    @Override
    public void request() {
        System.out.println("Target method is run!");
    }
}
