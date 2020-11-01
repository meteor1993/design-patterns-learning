package com.geekdigging.chapter06.prototype;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/11/1
 * @Time: 20:08
 * @email: inwsy@hotmail.com
 * Description:
 */
public class ResumeClone implements Cloneable {
    private String name;
    private String position;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    protected ResumeClone clone(){
        ResumeClone resumeClone = null;
        try{
            resumeClone = (ResumeClone) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return resumeClone;
    }

    @Override
    public String toString() {
        return "ResumeClone{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
