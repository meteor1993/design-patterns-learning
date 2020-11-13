package com.geekdigging.chapter10.dress;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/11/13
 * @Time: 23:19
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Shoes extends Clothes {
    public Shoes(Person person) {
        super(person);
    }
    @Override
    void dress() {
        super.dress();
        this.dressShoes();
    }

    private void dressShoes() {
        System.out.println("穿上鞋子啦！！！");
    }
}
