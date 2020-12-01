package com.geekdigging.chapter16.bank;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/12/1
 * @Time: 21:43
 * @email: inwsy@hotmail.com
 * Description:
 */
public interface ITransfer {
    // 首先发起转账
    void start(String amount);
    // 账户 A 进行扣费
    void subtractionA();
    // 账户 B 增加金额
    void addB();
    // 转账完成
    void end();
}
