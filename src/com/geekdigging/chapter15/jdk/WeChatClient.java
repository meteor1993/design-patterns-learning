package com.geekdigging.chapter15.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * Created with IntelliJ IDEA.
 *
 * 微信客户端（具体观察者）
 *
 * @Date: 2020/11/29
 * @Time: 17:40
 * @email: inwsy@hotmail.com
 * Description:
 */
public class WeChatClient implements Observer {

    private String username;

    public WeChatClient(String username) {
        this.username = username;
    }

    @Override
    public void update(Observable o, Object arg) {
        WechatNotice notice = (WechatNotice) arg;
        System.out.println(String.format("用户<%s> 接收到 <%s>微信公众号 的推送，文章标题为 <%s>", username, notice.getPublisher(), notice.getArticleName()));
    }
}
