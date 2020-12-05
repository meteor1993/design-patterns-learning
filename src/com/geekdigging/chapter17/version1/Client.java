package com.geekdigging.chapter17.version1;

public class Client {
    public static void main(String[] args) {
        Git git = new Git();
        // 初始化版本
        git.setState("version1");
        System.out.println("当前的版本信息：");
        System.out.println(git.getState());
        // 记录下当前的状态
        Git backup = new Git();
        backup.setState(git.getState());
        // 提交一个版本，版本进行改变
        git.changeState();
        System.out.println("提交一个版本后的版本信息：");
        System.out.println(git.getState());
        // 回退一个版本，版本信息回滚
        git.setState(backup.getState());
        System.out.println("回退一个版本后的版本信息：");
        System.out.println(git.getState());
    }
}
