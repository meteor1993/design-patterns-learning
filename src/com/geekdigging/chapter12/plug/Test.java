package com.geekdigging.chapter12.plug;

/**
 * Created with IntelliJ IDEA.
 *
 * @User: weishiyao
 * @Date: 2020/11/17
 * @Time: 0:34
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        AC ac = new Adapter220();
        ac.convert110v();
    }
}
