package com.geekdigging.chapter20.interpreter;

public abstract class Expression {
    abstract Object interpreter(Context ctx);
}
