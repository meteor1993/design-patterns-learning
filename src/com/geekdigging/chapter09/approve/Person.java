package com.geekdigging.chapter09.approve;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/11/9
 * @Time: 23:42
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Person implements IPerson {

    private int level;
    private String message;

    public Person(int level, String message) {
        this.level = level;
        switch (level) {
            case 1:
                this.message = "员工1的请求是：" + message;
                break;
            case 2 :
                this.message = "员工2的请求是：" + message;
                break;
            case 3 :
                this.message = "员工3的请求是：" + message;
                break;
            case 4 :
                this.message = "员工4的请求是：" + message;
                break;
        }
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public String getResult() {
        return this.message;
    }
}
