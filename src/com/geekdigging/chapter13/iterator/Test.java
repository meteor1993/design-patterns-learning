package com.geekdigging.chapter13.iterator;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/11/17
 * @Time: 22:25
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        Aggregate agg = new ConcreteAggregate();
        agg.add("aaa");
        agg.add("bbb");
        agg.add("ccc");
        Iterator iter = agg.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
