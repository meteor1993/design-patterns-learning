package com.geekdigging.chapter05.generaldynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/10/28
 * @Time: 22:02
 * @email: inwsy@hotmail.com
 * Description:
 */
public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader classLoader, Class<?>[] interfaces, InvocationHandler invocationHandler) {
        if (true) {
            new BeforeAdvice().exec();
        }
        return (T) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
    }
}
