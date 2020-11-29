package com.geekdigging.chapter15.jdk;

/**
 * Created with IntelliJ IDEA.
 *
 * 测试类
 *
 * @Date: 2020/11/29
 * @Time: 17:32
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        WeChatAccounts accounts = new WeChatAccounts("极客挖掘机");

        WeChatClient user1 = new WeChatClient("张三");
        WeChatClient user2 = new WeChatClient("李四");
        WeChatClient user3 = new WeChatClient("王五");

        accounts.addObserver(user1);
        accounts.addObserver(user2);
        accounts.addObserver(user3);

        accounts.publishArticles("设计模式 | 观察者模式及典型应用", "观察者模式的内容...");

        accounts.deleteObserver(user1);
        accounts.publishArticles("设计模式 | 单例模式及典型应用", "单例模式的内容....");
    }
}
