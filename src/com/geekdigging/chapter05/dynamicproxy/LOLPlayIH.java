package com.geekdigging.chapter05.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LOLPlayIH implements InvocationHandler {

    Class clazz;

    Object object;

    public LOLPlayIH(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.object, args);
        return result;
    }
}
