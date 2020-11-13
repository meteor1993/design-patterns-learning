package com.geekdigging.chapter10.dress;

import com.geekdigging.chapter09.approve.IPerson;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/11/13
 * @Time: 23:23
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Test1 {
    public static void main(String[] args) {
        Person person = new Man();
        person.dress();

        System.out.println("--------------");
        System.out.println("增加裤子适配器");
        person = new Trousers(person);
        person.dress();

        System.out.println("--------------");
        System.out.println("增加鞋子适配器");
        person = new Shoes(person);
        person.dress();

        System.out.println("--------------");
        System.out.println("增加外套适配器");
        person = new Coat(person);
        person.dress();
    }
}
