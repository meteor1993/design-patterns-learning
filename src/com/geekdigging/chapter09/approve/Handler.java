package com.geekdigging.chapter09.approve;

import com.geekdigging.chapter09.chain.Level;
import com.geekdigging.chapter09.chain.Request;
import com.geekdigging.chapter09.chain.Response;

public abstract class Handler {

    public final static int LEADER_LEVEL_1 = 1;
    public final static int LEADER_LEVEL_2 = 2;
    public final static int LEADER_LEVEL_3 = 3;

    // 当前能处理的级别
    private int level;
    // 责任传递，定义下一个责任人
    private Handler nextHandler;
    // 所有的类都需要定义自己的处理级别
    public Handler(int level) {
        this.level = level;
    }

    public final void handleMessage(IPerson person) {
        if (this.level == person.getLevel()) {
            this.response(person);
        } else {
            if (this.nextHandler != null) {
                this.nextHandler.handleMessage(person);
            } else {
                System.out.println("没有匹配到，自己想怎么处理怎么处理吧");
            }
        }
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected abstract void response(IPerson person);
}
