package com.geekdigging.chapter15.teacher;

import java.util.Date;

/**
 * 课程类
 */
public class Course {
    private Date time;
    private String place;
    private String content;
    public Course() {
    }

    public Course(Date time, String place, String content) {
        this.time = time;
        this.place = place;
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
