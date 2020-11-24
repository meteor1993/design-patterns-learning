package com.geekdigging.chapter15.teacher;

import java.util.ArrayList;
import java.util.List;

public class StudentSubject extends Subject {
    // 定义上课状态
    private String state;

    private List<Observer> observableList = new ArrayList<>();

    @Override
    void doNotify() {
        for (Observer observer : this.observableList) {
            observer.update(state);
        }
    }

    @Override
    void addObservable(Observer o) {
        this.observableList.add(o);
    }

    @Override
    void removeObservable(Observer o) {
        try {
            if (o == null) {
                throw new Exception("要移除的被观察者不能为空");
            } else {
                if (this.observableList.contains(o) ) {
                    System.out.println("下课了,"+o.getIdentity()+" 已回到办公室");
                    this.observableList.remove(o);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
