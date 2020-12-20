package com.geekdigging.chapter20.calculator;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 *
 * 抽象表达式类
 *
 * @Date: 2020/12/20
 * @Time: 10:03
 * @email: inwsy@hotmail.com
 * Description:
 */
public abstract class Expression {
    abstract int interpreter(HashMap<String, Integer> var);
}
