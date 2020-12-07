package com.geekdigging.chapter18.visitor;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/12/7
 * @Time: 23:03
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Element e1 = ObjectStruture.createElement();
            e1.accept(new Visitor());
        }
    }
}
