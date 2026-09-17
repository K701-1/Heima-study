package com.basic.test;

import java.util.Random;

public class Test2 {

    /*
    红包问题
    给两个整数 M 和 N，表示红包的总金额为M元，红包个数为N个，求每个红包金额。
    注意：每个红包金额不能小于0.01元。
         每个人领完后至少预留1*N元。
         最后一个人拿剩下金额。
    */
    public static void main(String[] args) {
        int money = 20000;//分
        int n = 5;
        Random r = new Random();

        for (int i = 1; i < n - 1; i++) {
            int money1 = r.nextInt(money - (n - i));
        }
    }

}
