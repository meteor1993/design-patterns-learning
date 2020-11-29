package com.geekdigging.chapter15.jdk;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/11/29
 * @Time: 17:37
 * @email: inwsy@hotmail.com
 * Description:
 */
public class WechatNotice {
    private String publisher;
    private String articleName;

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public WechatNotice() {
    }

    public WechatNotice(String publisher, String articleName) {
        this.publisher = publisher;
        this.articleName = articleName;
    }
}
