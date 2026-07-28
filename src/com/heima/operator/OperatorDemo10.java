package com.heima.operator;

import java.util.Scanner;

public class OperatorDemo10 {
    public static void main(String[] args) {
        //练习二：键盘录入一个三位数，判断是否能被三整除

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int num = sc.nextInt();

        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;

        int sum = ge + shi + bai;

        boolean result = sum % 3 == 0;
        System.out.println(result);
    }
}
