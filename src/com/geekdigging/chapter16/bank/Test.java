package com.geekdigging.chapter16.bank;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/12/1
 * @Time: 21:49
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        ITransfer transfer = new TransferImpl();
        transfer.start("1000");
        transfer.subtractionA();
        transfer.addB();
        transfer.end();
    }
}
