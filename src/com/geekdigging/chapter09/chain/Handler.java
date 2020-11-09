package com.geekdigging.chapter09.chain;

public abstract class Handler {
    private Handler nextHandler;

    public final Response handleMessage(Request request) {
        Response response = null;
        if (this.getHandlerLevel().equals(request.getLevel())) {
            response = this.echo(request);
        } else {
            if (this.nextHandler != null) {
                response = this.nextHandler.handleMessage(request);
            } else {
                // 没有匹配的业务处理者，逻辑根据具体场景实现
            }
        }

        return response;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected abstract Level getHandlerLevel();

    protected abstract Response echo(Request request);
}
