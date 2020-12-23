package com.geekdigging.chapter21.webSite;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/12/23
 * @Time: 21:12
 * @email: inwsy@hotmail.com
 * Description:
 */
public class WebSiteFactory {
    private HashMap<String, WebSite> pool = new HashMap<>();

    //获得网站分类
    public WebSite getWebSiteCategory(String key) {
        if(!pool.containsKey(key)) {
            pool.put(key, new ConcreteWebSite(key));
        }
        return pool.get(key);
    }

    //获得网站分类总数
    public int getWebSiteCount() {
        return pool.size();
    }
}
