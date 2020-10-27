package com.geekdigging.chapter05.lolproxy;

/**
 * Created with IntelliJ IDEA.
 *
 * 代练者
 *
 * @Date: 2020/10/27
 * @Time: 23:38
 * @email: inwsy@hotmail.com
 * Description:
 */
public class LOLPlayerProxy implements ILOLPlayer {

    private ILOLPlayer ilolPlayer;

    public LOLPlayerProxy(LOLPlayer playerLayer) {
        this.ilolPlayer = playerLayer;
    }

    @Override
    public void login(String name, String password) {
        this.ilolPlayer.login(name, password);
    }

    @Override
    public void pentaKill() {
        this.ilolPlayer.pentaKill();
    }

    @Override
    public void victory() {
        this.ilolPlayer.victory();
    }
}
