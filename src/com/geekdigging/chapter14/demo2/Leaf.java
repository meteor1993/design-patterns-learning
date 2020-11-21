package com.geekdigging.chapter14.demo2;

public class Leaf extends Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    void printStruct(String preStr) {
        System.out.println(preStr + " - " + name);
    }
}
