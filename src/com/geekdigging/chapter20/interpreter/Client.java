package com.geekdigging.chapter20.interpreter;

import java.util.Stack;

public class Client {
    public static void main(String[] args) {
        Context ctx = new Context();
        Stack<Expression> stack = null;
        for(int i = 0; i < args.length; i++){
            // 进行语法判断， 并产生递归调用
        }
        // 产生一个完整的语法树， 由各个具体的语法分析进行解析
        Expression exp = stack.pop();
        //具体元素进入场景
        exp.interpreter(ctx);
    }
}
