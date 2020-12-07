package com.geekdigging.chapter18.visitor;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/12/7
 * @Time: 22:58
 * @email: inwsy@hotmail.com
 * Description:
 */
public class ObjectStruture {
    public static Element createElement() {
        Random random = new Random();
        if (random.nextInt(100) > 50) {
            return new ConcreteElement1();
        } else {
            return new ConcreteElement2();
        }
    }
}
