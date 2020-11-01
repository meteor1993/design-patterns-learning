package com.geekdigging.chapter06.prototype;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/11/1
 * @Time: 21:02
 * @email: inwsy@hotmail.com
 * Description:
 */
public class PrototypeClass implements Cloneable{
    @Override
    protected PrototypeClass clone() {
        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototypeClass;
    }
}
