package com.geekdigging.chapter17.clone;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/12/6
 * @Time: 16:34
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        // 定义发起人
        Originator originator = new Originator();
        // 创建初始状态
        originator.setState("初始状态");
        System.out.println("初始状态：" + originator.getState());
        // 创建备份
        originator.createMemento();
        // 修改状态
        originator.setState("修改后的状态");
        System.out.println("修改后的状态：" + originator.getState());
        // 恢复状态
        originator.restoreMemento();
        System.out.println("恢复后的状态：" + originator.getState());
    }
}
