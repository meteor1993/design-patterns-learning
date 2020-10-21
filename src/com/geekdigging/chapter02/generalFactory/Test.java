package com.geekdigging.chapter02.generalFactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/10/21
 * @Time: 23:24
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
        // 继续进行其他处理
    }
}
