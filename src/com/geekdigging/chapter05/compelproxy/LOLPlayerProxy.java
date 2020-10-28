package com.geekdigging.chapter05.compelproxy;

public class LOLPlayerProxy implements ILOLPlayer {

    private ILOLPlayer iloLPlayer;

    public LOLPlayerProxy(ILOLPlayer iloLPlayer) {
        this.iloLPlayer = iloLPlayer;
    }

    @Override
    public void login(String name, String password) {
        this.iloLPlayer.login(name, password);
    }

    @Override
    public void pentaKill() {
        this.iloLPlayer.pentaKill();
    }

    @Override
    public void victory() {
        this.iloLPlayer.victory();
    }

    @Override
    public ILOLPlayer getProxy() {
        return this;
    }
}
