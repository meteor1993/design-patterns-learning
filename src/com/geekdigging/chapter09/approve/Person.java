package com.geekdigging.chapter09.approve;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/11/9
 * @Time: 23:42
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Person implements IPerson {

    private int days;
    private String message;

    public Person(int days) {
        this.days = days;
        this.message = "领导，我想请 " + days + " 天假！！！";
    }

    @Override
    public int getDays() {
        return this.days;
    }

    @Override
    public String getResult() {
        return this.message;
    }
}
