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
    // 小组长
    public Leader1() {
        super(Handler.MIN);
    }

    @Override
    protected void response(IPerson person) {
        System.out.println("-----------向小组长请示------------");
        System.out.println(person.getResult());
        System.out.println("-----------请示通过---------------");
    }
}
