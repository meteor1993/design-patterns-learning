package com.geekdigging.chapter14.demo1;

/**
 * Created with IntelliJ IDEA.
 *
 * 叶子节点
 *
 * @Date: 2020/11/21
 * @Time: 10:05
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Leaf {
    // 叶子对象的名字
    private String name;
    // 构造方法
    public Leaf(String name) {
        this.name = name;
    }
    // 输出叶子对象的结构，叶子对象没有子对象，也就是输出叶子对象的名字
    public void printStruct(String preStr) {
        System.out.println(preStr + " - " + name);
    }
}
