package com.geekdigging.chapter20.calculator;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 *
 * 变量解析器
 *
 * @Date: 2020/12/20
 * @Time: 10:03
 * @email: inwsy@hotmail.com
 * Description:
 */
public class VarExpression extends Expression {
    private String key;
    public VarExpression(String key) {
        this.key = key;
    }
    @Override
    int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
