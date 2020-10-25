package com.geekdigging.chapter04.builder;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * 抽象 Builder
 *
 * @Date: 2020/10/25
 * @Time: 21:02
 * @email: inwsy@hotmail.com
 * Description:
 */
public abstract class Builder {
    // 创建一个生产顺序模型
    public abstract void setSequence(ArrayList<String> sequence);
    // 生产完成后获取这个车辆模型
    public abstract AbstractBike getBike();
}
