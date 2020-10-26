package com.geekdigging.chapter04.builder;

/**
 * Created with IntelliJ IDEA.
 *
 * 抽象建造者
 *
 * @Date: 2020/10/26
 * @Time: 22:06
 * @email: inwsy@hotmail.com
 * Description:
 */
public abstract class Builder {
    // 设置产品不同的部分，用来获得不同的产品
    abstract void setPart();
    // 建造产品
    abstract Product buildProduct();
}
