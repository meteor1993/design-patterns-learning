package com.geekdigging.chapter18.kpi;

import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * 员工业务报表类
 *
 * @Date: 2020/12/11
 * @Time: 22:55
 * @email: inwsy@hotmail.com
 * Description:
 */
public class BusinessReport {
    private List<Staff> mStaffs = new LinkedList<>();

    public BusinessReport() {
        mStaffs.add(new Manager("经理-A"));
        mStaffs.add(new Engineer("工程师-A"));
        mStaffs.add(new Engineer("工程师-B"));
        mStaffs.add(new Manager("经理-B"));
        mStaffs.add(new Engineer("工程师-C"));
    }

    /**
     * 为访问者展示报表
     * @param visitor 公司高层，如 CEO、CTO
     */
    public void showReport(Visitor visitor) {
        for (Staff staff : mStaffs) {
            staff.accept(visitor);
        }
    }
}
