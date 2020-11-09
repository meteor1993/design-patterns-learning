package com.geekdigging.chapter09.approve;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/11/10
 * @Time: 0:01
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Leader1 extends Handler {
    public Leader1() {
        super(Handler.LEADER_LEVEL_1);
    }

    @Override
    protected void response(IPerson person) {
        System.out.println("-----------向领导1请示------------");
        System.out.println(person.getResult());
        System.out.println("-----------请示通过---------------");
    }
}
