package com.geekdigging.chapter21.webSite;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/12/23
 * @Time: 21:11
 * @email: inwsy@hotmail.com
 * Description:
 */
public class ConcreteWebSite extends WebSite {

    private String name;

    public ConcreteWebSite(String name) {
        this.name = name;
    }

    @Override
    void use(User user) {
        System.out.println("网站分类：" + name + " 用户：" + user.getName());
    }
}
