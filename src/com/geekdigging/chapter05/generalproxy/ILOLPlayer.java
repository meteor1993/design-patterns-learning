package com.geekdigging.chapter05.generalproxy;

/**
 * Created with IntelliJ IDEA.
 *
 * 游戏者接口
 *
 * @Date: 2020/10/27
 * @Time: 22:28
 * @email: inwsy@hotmail.com
 * Description:
 */
public interface ILOLPlayer {
    // 登录使用用户名和密码
    void login(String name, String password);
    // 拿到五杀
    void pentaKill();
    // 游戏胜利
    void victory();
}
