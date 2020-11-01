package com.geekdigging.chapter06.prototype;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/11/1
 * @Time: 21:32
 * @email: inwsy@hotmail.com
 * Description:
 */
public class ConstructorDemo implements Cloneable {
    public ConstructorDemo() {
        System.out.println("我被执行了。。。");
    }

    @Override
    protected ConstructorDemo clone(){
        ConstructorDemo demo = null;
        try {
            demo = (ConstructorDemo) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return demo;
    }
}
