package com.geekdigging.chapter04.builder;

/**
 * Created with IntelliJ IDEA.
 *
 * 具体建造者
 *
 * @Date: 2020/10/26
 * @Time: 22:07
 * @email: inwsy@hotmail.com
 * Description:
 */
public class ConcreteProduct extends Builder{
    private Product product = new Product();
    @Override
    void setPart() {
        // 独特的处理逻辑
    }

    @Override
    Product buildProduct() {
        return product;
    }
}
