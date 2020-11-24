package com.geekdigging.chapter15.teacher;

/**
 * 班主任
 */
public class HeadTeacherObserver extends Observer {
    public HeadTeacherObserver(String identity) {
        super(identity);
    }

    @Override
    String getIdentity() {
        return super.identity;
    }

    @Override
    void update(Object args) {
        System.out.println("我是班主任来听课了,正在检查课程质量...");
        System.out.println("学生反馈课程质量为:" + args);
    }
}
