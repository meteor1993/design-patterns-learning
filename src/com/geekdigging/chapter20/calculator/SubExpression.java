package com.geekdigging.chapter20.calculator;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 *
 * 减法解析器
 *
 * @Date: 2020/12/20
 * @Time: 10:04
 * @email: inwsy@hotmail.com
 * Description:
 */
public class SubExpression extends SymbolExpression {
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
