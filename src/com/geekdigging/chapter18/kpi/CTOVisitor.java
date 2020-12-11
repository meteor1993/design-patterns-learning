package com.geekdigging.chapter18.kpi;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/12/12
 * @Time: 0:01
 * @email: inwsy@hotmail.com
 * Description:
 */
public class CTOVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师: " + engineer.name + ", 代码行数: " + engineer.getCodeLines());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理: " + manager.name + ", 产品数量: " + manager.getProducts());
    }
}
