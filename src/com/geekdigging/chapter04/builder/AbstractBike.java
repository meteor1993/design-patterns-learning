package com.geekdigging.chapter04.builder;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * 自行车产品类
 *
 * @Date: 2020/10/25
 * @Time: 18:51
 * @email: inwsy@hotmail.com
 * Description:
 */
public abstract class AbstractBike {
    // 各个零件制造顺序
    private ArrayList<String> sequence = new ArrayList<> ();
    // 自行车车架
    protected abstract void frame();
    // 自行车座位
    protected abstract void seat();
    // 自行车轮子
    protected abstract void tire();
    // 生产方法
    final public void createBike() {
        for (int i = 0; i < sequence.size(); i++) {
            String actionName = this.sequence.get(i);
            if (actionName.equalsIgnoreCase("frame")) {
                this.frame();
            } else if (actionName.equalsIgnoreCase("seat")) {
                this.seat();
            } else if (actionName.equalsIgnoreCase("tire")) {
                this.tire();
            }
        }
    }

    final public void setSequence(ArrayList sequence) {
        this.sequence = sequence;
    }
}
