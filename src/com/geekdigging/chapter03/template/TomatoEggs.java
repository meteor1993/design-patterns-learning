package com.geekdigging.chapter03.template;

public class TomatoEggs extends AbstractCook {
    @Override
    public void xicai() {
        System.out.println("番茄炒蛋先洗菜");
    }

    @Override
    public void qiecai() {
        System.out.println("番茄炒蛋再切菜");
    }

    @Override
    public void qiguoshaoyou() {
        System.out.println("现在开始起锅烧油做番茄炒蛋");
    }

    @Override
    public void zhuangpan() {
        System.out.println("番茄炒蛋烧好以后装盘");
    }

}
