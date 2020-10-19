package com.geekdigging.chapter01.single;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/10/19
 * @Time: 23:23
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Soldier {
    public static void main(String[] args) {
        for (int soldiers = 0; soldiers < 5; soldiers++) {
            General general = General.getInstance();
            general.command();
        }
    }
}
