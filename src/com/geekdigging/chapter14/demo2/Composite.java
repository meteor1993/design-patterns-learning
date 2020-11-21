package com.geekdigging.chapter14.demo2;

import com.geekdigging.chapter14.demo1.Leaf;

import java.util.ArrayList;
import java.util.Collection;

public class Composite extends Component{

    // 组合对象集合
    private Collection<Component> childComponents;

    // 组合对象的名字
    private String name;

    public Composite(String name) {
        this.name = name;
    }

    public void addChild(Component child) {
        if (this.childComponents == null) {
            this.childComponents = new ArrayList<>();
        }
        this.childComponents.add(child);
    }

    void removeChild(Component child) {
        this.childComponents.remove(child);
    }

    Collection getChildren() {
        return this.childComponents;
    }

    @Override
    void printStruct(String preStr) {
        System.out.println(preStr + " + " + this.name);
        if (this.childComponents != null) {
            preStr+=" ";
            for(Component c : this.childComponents){
                //递归输出每个子对象
                c.printStruct(preStr);
            }
        }
    }
}
