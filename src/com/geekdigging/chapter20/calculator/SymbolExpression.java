package com.geekdigging.chapter20.calculator;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 *
 * 抽象运算符号解析器
 *
 * @Date: 2020/12/20
 * @Time: 10:04
 * @email: inwsy@hotmail.com
 * Description:
 */
public class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    @Override
    int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
