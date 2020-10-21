package com.geekdigging.chapter02.generalFactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/10/21
 * @Time: 23:20
 * @email: inwsy@hotmail.com
 * Description:
 */
public abstract class Creator {
    public abstract <T extends Product> T createProduct(Class<T> clazz);
}
