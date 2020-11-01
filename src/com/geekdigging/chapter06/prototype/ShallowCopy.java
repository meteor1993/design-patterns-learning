package com.geekdigging.chapter06.prototype;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/11/1
 * @Time: 22:13
 * @email: inwsy@hotmail.com
 * Description:
 */
public class ShallowCopy implements Cloneable {
    private ArrayList<String> array = new ArrayList<> ();
    // 浅拷贝
//    @Override
//    public ShallowCopy clone() {
//        ShallowCopy copy = null;
//        try {
//            copy = (ShallowCopy) super.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        return copy;
//    }

    // 深拷贝
    @Override
    public ShallowCopy clone() {
        ShallowCopy copy = null;
        try {
            copy = (ShallowCopy) super.clone();
            this.array = (ArrayList<String>) this.array.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return copy;
    }

    public void setValue(String value) {
        this.array.add(value);
    }

    public ArrayList<String> getValue() {
        return this.array;
    }
}
