package com.geekdigging.chapter07.landlord;

/**
 * https://www.cnblogs.com/hulizhong/p/11655641.html
 * 抽象中介类
 */
public abstract class Mediator {
    public abstract void Common(String type);

    private SmallHouseColleague smallHouse;
    private TwoHouseColleague twoHouse;
    private ThreeHouseColleague threeHouse;

    public void setSmallHouse(SmallHouseColleague smallHouse) {
        this.smallHouse = smallHouse;
    }

    public void setTwoHouse(TwoHouseColleague twoHouse) {
        this.twoHouse = twoHouse;
    }

    public void setThreeHouse(ThreeHouseColleague threeHouse) {
        this.threeHouse = threeHouse;
    }
}
