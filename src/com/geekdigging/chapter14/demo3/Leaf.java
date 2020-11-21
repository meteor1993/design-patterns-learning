package com.geekdigging.chapter14.demo3;

import java.util.Collection;

public class Leaf extends Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    // 向组合对象中加入组件对象
    @Deprecated
    public void addChild(Component child) {
        // 缺省实现，如果子类未实现此功能，由父类抛出异常
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

    // 从组合对象中移出某个组件对象
    @Deprecated
    public void removeChild(Component child){
        // 缺省实现，如果子类未实现此功能，由父类抛出异常
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

    @Deprecated
    Collection getChildren() {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

    @Override
    void printStruct(String preStr) {
        System.out.println(preStr + " - " + name);
    }
}
