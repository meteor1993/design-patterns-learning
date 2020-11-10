package com.geekdigging.chapter09.chain;

public abstract class Handler {
    private Handler nextHandler;

    // 每个处理者都必须对请求作出处理
    public final Response handleMessage(Request request) {
        Response response = null;
        // 判断当前处理级别
        if (this.getHandlerLevel().equals(request.getLevel())) {
            response = this.echo(request);
        } else {
            // 判断是否有下一个处理者
            if (this.nextHandler != null) {
                response = this.nextHandler.handleMessage(request);
            } else {
                // 没有匹配的业务处理者，逻辑根据具体场景实现
            }
        }
        return response;
    }
    // 设置下一个处理者
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected abstract Level getHandlerLevel();

    protected abstract Response echo(Request request);
}
