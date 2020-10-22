package com.geekdigging.chapter03.template;

public class ManHanBanquet extends AbstractCook {
    @Override
    public void xicai() {
        System.out.println("满汉全席先洗菜");
    }

    @Override
    public void qiecai() {
        System.out.println("满汉全席切菜");
    }

    @Override
    public void qiguoshaoyou() {
        System.out.println("满汉全席也要起锅烧油");
    }

    @Override
    public void zhuangpan() {
        System.out.println("满汉全席要装盘的有点多");
    }

    @Override
    public void cook() {
        this.xicai();
        this.qiecai();
        this.qiguoshaoyou();
        this.zhuangpan();
    }
}
