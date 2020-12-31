package com.geekdigging.chapter22.phone;

/**
 * 客户端类
 */
public class Client {
    public static void main(String[] args) {
        HandsetBrand ab;

        // 使用 A 品牌手机
        ab = new HandsetBrandA();
        System.out.println("A品牌手机：");

        ab.setHandsetSoft(new HandsetGame());
        ab.run();

        ab.setHandsetSoft(new HandsetAddressList());
        ab.run();

        // 使用 B 品牌手机
        ab = new HandsetBrandB();
        System.out.println("B品牌手机：");

        ab.setHandsetSoft(new HandsetGame());
        ab.run();

        ab.setHandsetSoft(new HandsetAddressList());
        ab.run();
    }
}
