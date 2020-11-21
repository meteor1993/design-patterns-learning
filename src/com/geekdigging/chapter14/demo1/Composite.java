package com.geekdigging.chapter14.demo1;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 *
 * 组合对象，可以包含其它组合对象或者叶子对象
 *
 * @Date: 2020/11/21
 * @Time: 10:18
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Composite {
    // 组合对象集合
    private Collection<Composite> childComposite = new ArrayList<>();
    // 叶子对象集合
    private Collection<Leaf> childLeaf = new ArrayList<>();
    // 组合对象名称
    private String name;
    // 构造函数
    public Composite(String name) {
        this.name = name;
    }
    // 向组合对象加入被它包含的其它组合对象
    public void addComposite(Composite c){
        this.childComposite.add(c);
    }
    // 向组合对象加入被它包含的叶子对象
    public void addLeaf(Leaf leaf){
        this.childLeaf.add(leaf);
    }
    // 输出自身结构
    public void printStruct(String preStr){
        System.out.println(preStr + " + " + this.name);
        preStr+=" ";
        for(Leaf leaf : childLeaf){
            leaf.printStruct(preStr);
        }
        for(Composite c : childComposite){
            c.printStruct(preStr);
        }
    }
}
