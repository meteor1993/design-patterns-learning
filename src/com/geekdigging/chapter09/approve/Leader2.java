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
    // 大组长
    public Leader2() {
        super(Handler.MIDDLE);
    }

    @Override
    protected void response(IPerson person) {
        System.out.println("-----------向大组长请示------------");
        System.out.println(person.getResult());
        System.out.println("-----------请示通过---------------");
    }
}
