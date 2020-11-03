package com.geekdigging.chapter07.landlord;

public class HouseMediator extends Mediator {
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

    @Override
    public void Common(String type) {
        switch (type) {
            case "单间":
                smallHouse.showHouse();
                System.out.println("如果可以就可以租房了!");
                break;
            case "两居室":
                twoHouse.showHouse();
                System.out.println("如果可以就可以租房了!");
                break;
            case "三居室":
                threeHouse.showHouse();
                System.out.println("如果可以就可以租房了!");
                break;
            default:
                System.out.println(type + "暂时没有房源!");
                break;
        }
    }
}
