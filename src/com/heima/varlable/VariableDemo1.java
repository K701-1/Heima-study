package com.heima.varlable;

public class VariableDemo1 {
    public static void main(String[] args) {
        /*微信余额:0元
          支付宝余额:10元
          银行卡余额:20元
          问题一:请问现在一共有多少钱?
          问题二:微信收了10元红包，又发了2元红包，余额多少?*/

        //定义一个变量记录余额
        double a = 0;

        //定义一个变量记录支付宝余额
        double b = 10;

        //定义一个变量记录银行卡余额
        double c = 20;

        //问题一:请问现在一共有多少钱?
        System.out.println("现在一共有:" + (a + b + c) + "元");

        //问题二:微信收了10元红包，又发了2元红包，余额多少?
        System.out.println("微信收了10元红包，又发了2元红包，余额:" + (a + 10 - 2) + "元");
    }
}
