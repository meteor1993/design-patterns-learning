package com.geekdigging.chapter09.chain;

public class ConcreteHandler1 extends Handler {
    @Override
    protected Level getHandlerLevel() {
        // 设置自己的处理级别
        return null;
    }

    @Override
    protected Response echo(Request request) {
        // 设置处理的业务功能
        return null;
    }
}
