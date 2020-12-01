package com.geekdigging.chapter16.notice;

import com.geekdigging.chapter16.facade.ClassA;
import com.geekdigging.chapter16.facade.ClassB;
import com.geekdigging.chapter16.facade.ClassC;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/11/30
 * @Time: 22:50
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Facade1 {
    private ClassA classA = new ClassA();
    private ClassB classB = new ClassB();
    private Context context = new Context();
    public void methodA() {
        this.classA.doSomethingA();
    }
    public void methodB() {
        this.classB.doSomethingB();
    }
    public void methodC() {
        this.context.complexMethod();
    }
}
