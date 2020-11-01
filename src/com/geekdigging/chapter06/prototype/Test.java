package com.geekdigging.chapter06.prototype;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/11/1
 * @Time: 18:07
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        Resume resume1 = new Resume();
        resume1.setName("小郭");
        resume1.setPosition("一代大侠");
        resume1.setSalary(1000);
        System.out.println(resume1);

        Resume resume2 = new Resume();
        resume2.setName("小郭");
        resume2.setPosition("一代大侠");
        resume2.setSalary(1200);
        System.out.println(resume2);

        Resume resume3 = new Resume();
        resume3.setName("小郭");
        resume3.setPosition("一代大侠");
        resume3.setSalary(1500);
        System.out.println(resume3);

        for (int i = 0; i < 5; i++) {
            Resume resume4 = new Resume();
            int salary = (int)(1000 + Math.random() * (2000 - 1000 + 1));
            resume4.setName("小郭");
            resume4.setPosition("一代大侠");
            resume4.setSalary(salary);
            System.out.println(resume4.toString());
        }
    }
}
