package com.geekdigging.chapter09.approve;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/11/10
 * @Time: 0:14
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Test {
    public static void main(String[] args) {

        Random random = new Random();

        ArrayList<IPerson> personList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            personList.add(new Person(random.nextInt(4), "领导，我想请假"));
        }

        Handler leader1 = new Leader1();
        Handler leader2 = new Leader2();
        Handler leader3 = new Leader3();

        leader1.setNextHandler(leader2);
        leader2.setNextHandler(leader3);

        for (IPerson person: personList) {
            leader1.handleMessage(person);
        }
    }
}
