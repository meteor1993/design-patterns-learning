package com.geekdigging.chapter18.kpi;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/12/11
 * @Time: 22:52
 * @email: inwsy@hotmail.com
 * Description:
 */
public interface Visitor {
    // 访问工程师类型
    void visit(Engineer engineer);
    // 访问经理类型
    void visit(Manager manager);
}
