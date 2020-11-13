package com.geekdigging.chapter10.dress;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/11/13
 * @Time: 22:59
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Trousers extends Clothes {
    public Trousers(Person person) {
        super(person);
    }

    @Override
    void dress() {
        super.dress();
        this.dressTrousers();
    }

    private void dressTrousers() {
        System.out.println("穿上裤子啦！！！");
    }
}
