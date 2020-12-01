package com.geekdigging.chapter16.bank;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/12/1
 * @Time: 21:45
 * @email: inwsy@hotmail.com
 * Description:
 */
public class TransferImpl implements ITransfer {
    @Override
    public void start(String amount) {
        System.out.println(String.format("账户 A 开始向账户 B 进行转账： %s 元。", amount));
    }

    @Override
    public void subtractionA() {
        System.out.println("账户 A 扣费成功");
    }

    @Override
    public void addB() {
        System.out.println("账户 B 余额增加成功");
    }

    @Override
    public void end() {
        System.out.println("转账完成");
    }
}
