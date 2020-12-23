package com.geekdigging.chapter21.webSite;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/12/23
 * @Time: 21:14
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();

        WebSite fx = factory.getWebSiteCategory("视频站");
        fx.use(new User("tom"));

        WebSite fy = factory.getWebSiteCategory("视频站");
        fy.use(new User("cat"));

        WebSite fz = factory.getWebSiteCategory("视频站");
        fz.use(new User("nginx"));

        WebSite fa = factory.getWebSiteCategory("图文站");
        fa.use(new User("apache"));

        WebSite fb = factory.getWebSiteCategory("图文站");
        fb.use(new User("netty"));

        WebSite fc = factory.getWebSiteCategory("图文站");
        fc.use(new User("jboss"));

        System.out.println("网站分类总数为：" + factory.getWebSiteCount());
    }
}
