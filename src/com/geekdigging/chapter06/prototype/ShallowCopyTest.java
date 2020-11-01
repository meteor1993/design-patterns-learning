package com.geekdigging.chapter06.prototype;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/11/1
 * @Time: 22:20
 * @email: inwsy@hotmail.com
 * Description:
 */
public class ShallowCopyTest {
    public static void main(String[] args) {
        ShallowCopy copy = new ShallowCopy();
        copy.setValue("123");
        ShallowCopy copy1 = copy.clone();
        copy1.setValue("456");
        System.out.println(copy.getValue());
    }
}
