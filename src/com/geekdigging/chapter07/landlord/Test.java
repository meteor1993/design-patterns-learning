package com.geekdigging.chapter07.landlord;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/11/3
 * @Time: 21:33
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("租客来看房啦！！！");
        //初始化中介
        HouseMediator mediator = new HouseMediator();
        //初始化房屋信息
        SmallHouseColleague smallHouseColleague = new SmallHouseColleague( );
        TwoHouseColleague twoHouseColleague = new TwoHouseColleague( );
        ThreeHouseColleague threeHouseColleague = new ThreeHouseColleague( );

        //中介获取房屋信息
        mediator.setSmallHouse(smallHouseColleague);
        mediator.setTwoHouse(twoHouseColleague);
        mediator.setThreeHouse(threeHouseColleague);

        // 租户A需要两居室、提供看房
        mediator.Common("两居室");

        // 租户B需要四居室、暂无房源
        mediator.Common("四居室");
    }
}
