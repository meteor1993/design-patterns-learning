package com.geekdigging.chapter09.approve;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/11/10
 * @Time: 0:05
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Leader3 extends Handler {
    public Leader3() {
        super(Handler.LEADER_LEVEL_3);
    }

    @Override
    protected void response(IPerson person) {
        System.out.println("-----------向领导3请示--------------");
        System.out.println(person.getResult());
        System.out.println("-----------请示通过---------------");
    }
}
