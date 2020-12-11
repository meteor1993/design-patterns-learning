package com.geekdigging.chapter18.kpi;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/12/11
 * @Time: 22:51
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Engineer extends Staff {
    public Engineer(String name) {
        super(name);
    }
    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
    // 工程师一年的代码数量
    public int getCodeLines() {
        return new Random().nextInt(10 * 10000);
    }
}
