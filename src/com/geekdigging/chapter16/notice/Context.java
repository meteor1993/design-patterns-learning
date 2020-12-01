package com.geekdigging.chapter16.notice;

import com.geekdigging.chapter16.facade.ClassA;
import com.geekdigging.chapter16.facade.ClassB;
import com.geekdigging.chapter16.facade.ClassC;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/12/1
 * @Time: 22:26
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Context {
    private ClassA classA = new ClassA();
    private ClassC classC = new ClassC();
    // 复杂的业务操作
    public void complexMethod() {
        this.classA.doSomethingA();
        this.classC.doSomethingC();
    }
}
