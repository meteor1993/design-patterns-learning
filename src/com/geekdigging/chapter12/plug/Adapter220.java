package com.geekdigging.chapter12.plug;

/**
 * Created with IntelliJ IDEA.
 *
 * @User: weishiyao
 * @Date: 2020/11/17
 * @Time: 0:28
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Adapter220 extends PowerPlug implements AC {
    @Override
    public void convert110v() {
        this.OutPut220V();
        System.out.println("通过适配器，将 220V 转换成 110V");
    }
}
