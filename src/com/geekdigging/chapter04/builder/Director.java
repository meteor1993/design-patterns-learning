package com.geekdigging.chapter04.builder;

/**
 * Created with IntelliJ IDEA.
 *
 * 导演类
 *
 * @Date: 2020/10/26
 * @Time: 22:09
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Director {
    private Builder builder = new ConcreteProduct();
    public Product getProduct() {
        builder.setPart();
        // 设置不同的 part ，生产不同的零件
        return builder.buildProduct();
    }
}
