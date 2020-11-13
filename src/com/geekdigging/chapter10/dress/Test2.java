package com.geekdigging.chapter10.dress;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/11/13
 * @Time: 23:26
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Test2 {
    public static void main(String[] args) {
        Person person = new Coat(new Shoes(new Trousers(new Man())));
        person.dress();
    }
}
