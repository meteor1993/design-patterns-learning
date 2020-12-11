package com.geekdigging.chapter18.kpi;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 *
 * 员工基类
 *
 * @Date: 2020/12/11
 * @Time: 22:49
 * @email: inwsy@hotmail.com
 * Description:
 */
public abstract class Staff {
    public String name;
    // 员工KPI
    public int kpi;

    public Staff(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    // 核心方法，接受Visitor的访问
    abstract void accept(Visitor visitor);
}
