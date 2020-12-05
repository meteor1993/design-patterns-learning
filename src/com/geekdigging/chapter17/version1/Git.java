package com.geekdigging.chapter17.version1;

/**
 * 版本管理工具 Git
 */
public class Git {
    private String state;
    // 版本发生改变，现在是 version2
    public void changeState() {
        this.state = "version2";
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
