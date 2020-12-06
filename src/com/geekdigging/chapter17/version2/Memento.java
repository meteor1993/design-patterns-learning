package com.geekdigging.chapter17.version2;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/12/6
 * @Time: 16:02
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
