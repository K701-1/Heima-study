package com.heima.loopwhile;

import java.sql.SQLOutput;

public class WhileDemo2 {
    public static void main(String[] args) {
        /*
        for和while的区别：
            1.for循环中，控制循环的变量归属for结构中，循环结束后变量无法被访问
              while循环中，变量不属于while结构中，循环结束后变量可以被访问，继续使用

            2.for循环中：知道 循环次数 或 循环范围
              while循环中：不知道循环次数和范围  只知道 循环结束条件
         */

        /*
        复利计算器  (复利:利滚利)
          假设银行投资100000元，银行给出复利1.7%，问多少年后实现本金翻倍
          问:用什么循环?(不知道次数,用while)代码?
        */

        double money = 100000;
        double expectMoney = 200000;

        int year = 0;
        while (money < expectMoney){
            money += money * 0.017;
            year++;
        }
        System.out.println("需要" + year + "年实现本金翻倍");
    }
}