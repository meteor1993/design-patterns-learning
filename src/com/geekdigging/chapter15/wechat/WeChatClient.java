package com.geekdigging.chapter15.wechat;

/**
 * Created with IntelliJ IDEA.
 *
 * 微信客户端（具体观察者）
 *
 * @Date: 2020/11/29
 * @Time: 17:22
 * @email: inwsy@hotmail.com
 * Description:
 */
public class WeChatClient implements Subscriber {

    private String username;

    public WeChatClient(String username) {
        this.username = username;
    }

    @Override
    public void receive(String publisher, String articleName) {
        System.out.println(String.format("用户<%s> 接收到 <%s>微信公众号 的推送，文章标题为 <%s>", username, publisher, articleName));
    }
}
