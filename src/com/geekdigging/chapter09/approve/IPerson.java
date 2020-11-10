package com.geekdigging.chapter09.approve;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/11/9
 * @Time: 23:40
 * @email: inwsy@hotmail.com
 * Description:
 */
public interface IPerson {
    // 获取当前请假天数
    int getDays();
    // 获取审批结果
    String getResult();
}
