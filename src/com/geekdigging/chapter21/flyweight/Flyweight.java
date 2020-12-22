package com.geekdigging.chapter21.flyweight;

public abstract class Flyweight {
    // 内部状态
    private String intrinsic;
    // 外部状态
    protected final String extrinsic;
    // 要求享元角色必须接受外部状态
    protected Flyweight(String extrinsic) {
        this.extrinsic = extrinsic;
    }
    // 定义业务操作
    abstract void operate();

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
