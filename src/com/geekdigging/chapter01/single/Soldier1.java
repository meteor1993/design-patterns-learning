package com.geekdigging.chapter01.single;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/10/20
 * @Time: 0:29
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Soldier1 {
    public static void main(String[] args) {
        for (int soldiers1 = 0; soldiers1 < 5; soldiers1++) {
            General1 general = General1.getInstance();
            general.command();
        }
    }
}
