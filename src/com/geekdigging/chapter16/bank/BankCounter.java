package com.geekdigging.chapter16.bank;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/12/1
 * @Time: 21:56
 * @email: inwsy@hotmail.com
 * Description:
 */
public class BankCounter {
    private ITransfer transfer = new TransferImpl();
    private Balance balance = new Balance();
    // 转账操作一体化
    public void transferAmount(String amount) {
        transfer.start(amount);
        transfer.subtractionA();
        // 增加余额校验
        if (balance.checkBalance()) {
            transfer.addB();
            transfer.end();
        }
    }
}
