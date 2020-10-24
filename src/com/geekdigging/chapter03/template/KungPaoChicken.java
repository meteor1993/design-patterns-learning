package com.geekdigging.chapter03.template;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/10/24
 * @Time: 23:01
 * @email: inwsy@hotmail.com
 * Description:
 */
public class KungPaoChicken extends AbstractCook {
    @Override
    public void xicai() {
        System.out.println("宫保鸡丁先洗菜");
    }

    @Override
    public void qiecai() {
        System.out.println("宫保鸡丁再切菜");
    }

    @Override
    public void qiguoshaoyou() {
        System.out.println("现在开始起锅烧油做宫保鸡丁");
    }

    @Override
    public void zhuangpan() {
        System.out.println("宫保鸡丁烧好以后装盘");
    }
}
