package com.geekdigging.chapter22.bridge;

/**
 * Created with IntelliJ IDEA.
 *
 * 具体抽象化角色
 *
 * @User: weishiyao
 * @Date: 2020/12/27
 * @Time: 1:01
 * @email: inwsy@hotmail.com
 * Description:
 */
public class RefinedAbstraction extends Abstraction {
    // 覆写构造函数
    public RefinedAbstraction(Implementor impl) {
        super(impl);
    }
    // 修正父类的行为
    @Override
    public void request(){
        // 业务处理
        super.request();
        super.getImpl().doAnything();
    }
}
