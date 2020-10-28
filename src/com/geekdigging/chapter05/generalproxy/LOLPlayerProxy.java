package com.geekdigging.chapter05.generalproxy;

public class LOLPlayerProxy implements ILOLPlayer {

    private ILOLPlayer iloLPlayer;

    public LOLPlayerProxy(String name) {
        try {
            iloLPlayer = new LOLPlayer(this, name);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
}
