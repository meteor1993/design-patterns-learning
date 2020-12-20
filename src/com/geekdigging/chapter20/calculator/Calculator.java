package com.geekdigging.chapter20.calculator;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/12/20
 * @Time: 10:03
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Calculator {
    private Expression expression;

    // 构造函数，传参并解析
    public Calculator(String expStr) {
        // 安排运算先后顺序
        Stack<Expression> stack = new Stack<>();
        // 表达式拆分为字符数组
        char[] charArray = expStr.toCharArray();

        Expression left = null;
        Expression right = null;

        for(int i=0; i<charArray.length; i++) {
            switch (charArray[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default :
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;
            }
        }
        this.expression = stack.pop();
    }

    public int run(HashMap<String, Integer> var) {
        return this.expression.interpreter(var);
    }
}
