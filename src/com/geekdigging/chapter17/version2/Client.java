package com.geekdigging.chapter17.version2;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/12/6
 * @Time: 16:06
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        Git git = new Git();
        // 初始化版本
        git.setState("version1");
        System.out.println("当前的版本信息：");
        System.out.println(git.getState());
        // 记录下当前的状态
        Memento mem = git.createMemento(git.getState());
        // 提交一个版本，版本进行改变
        git.changeState();
        System.out.println("提交一个版本后的版本信息：");
        System.out.println(git.getState());
        // 项目发布失败，回滚状态
        git.restoreMemento(mem);
        System.out.println("回退一个版本后的版本信息：");
        System.out.println(git.getState());
    }
}
