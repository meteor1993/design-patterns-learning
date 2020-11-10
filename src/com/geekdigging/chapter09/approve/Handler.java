package com.geekdigging.chapter09.approve;

public abstract class Handler {

    public final static int MIN = 3;
    public final static int MIDDLE = 5;
    public final static int MAX = 20;

    // 当前能处理的级别
    private int days;
    // 责任传递，定义下一个责任人
    private Handler nextHandler;
    // 所有的类都需要定义自己的能处理的请假天数
    public Handler(int days) {
        this.days = days;
    }

    public final void handleMessage(IPerson person) {
        if (this.days > person.getDays()) {
            this.response(person);
        } else {
            if (this.nextHandler != null) {
                this.nextHandler.handleMessage(person);
            } else {
                System.out.println("员工想要请假 " + this.days + " 天，超过可以审批的最大权限，那就不批了");
            }
        }
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected abstract void response(IPerson person);
}
