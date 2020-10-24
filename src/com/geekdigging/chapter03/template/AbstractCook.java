package com.geekdigging.chapter03.template;

public abstract class AbstractCook {
    /**
     * 做菜第一步就是先洗菜
     */
    public abstract void xicai();

    /**
     * 菜洗完了以后要切菜
     */
    public abstract void qiecai();

    /**
     * 然后就是起锅烧油，写到这的时候满脑子德子的声音
     */
    public abstract void qiguoshaoyou();

    /**
     * 菜烧好以后需要装盘就能上桌了
     */
    public abstract void zhuangpan();

    /**
     * 开始做菜，在抽象类里直接定义执行过程
     */
    public void cook(){
        this.xicai();
        this.qiecai();
        this.qiguoshaoyou();
        this.zhuangpan();
    }
}
