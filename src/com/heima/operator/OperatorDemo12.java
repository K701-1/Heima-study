package com.heima.operator;

import java.util.Scanner;

public class OperatorDemo12 {
    public static void main(String[] args) {

        //练习二：键盘录入一个整数，判断该数是否 不 在1-10之间

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        boolean result = !(num >= 1 && num <= 10);
        boolean result2 = num < 1 || num > 10;

        System.out.println(result);
        System.out.println(result2);
    }
}
