package com.geekdigging.chapter06.prototype;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/11/1
 * @Time: 20:10
 * @email: inwsy@hotmail.com
 * Description:
 */
public class TestClone {
    public static void main(String[] args) {
        int num = 5;
        ResumeClone resumeClone = new ResumeClone();
        while (num > 0){
            ResumeClone resume1 = resumeClone.clone();
            int salary = (int)(1000 + Math.random() * (2000 - 1000 + 1));
            resume1.setName("小郭");
            resume1.setPosition("一代大侠");
            resume1.setSalary(salary);
            System.out.println(resume1.toString());
            num --;
        }
    }
}
