package com.geekdigging.chapter22.phone;

/**
 * 手机品牌抽象类
 */
public abstract class HandsetBrand {
    protected HandsetSoft soft;
    // 设置手机软件
    public void setHandsetSoft(HandsetSoft soft) {
        this.soft = soft;
    }
    // 运行
    abstract void run();
}
