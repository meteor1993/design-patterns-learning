package com.geekdigging.chapter09.approve;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/11/10
 * @Time: 0:04
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Leader2 extends Handler {
    public Leader2() {
        super(Handler.LEADER_LEVEL_2);
    }

    @Override
    protected void response(IPerson person) {
        System.out.println("-----------向领导2请示------------");
        System.out.println(person.getResult());
        System.out.println("-----------请示通过---------------");
    }
}
