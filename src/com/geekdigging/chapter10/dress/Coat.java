package com.geekdigging.chapter10.dress;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/11/13
 * @Time: 23:21
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Coat extends Clothes {
    public Coat(Person person) {
        super(person);
    }

    @Override
    void dress() {
        super.dress();
        this.dressCoat();
    }

    private void dressCoat() {
        System.out.println("穿上外套啦！！！");
    }
}
