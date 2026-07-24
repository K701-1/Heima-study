package com.heima.operator;

import java.util.Scanner;

public class OperatorDemo2 {
    public static void main(String[] args) {
        /*
        键盘录入一个三位数，拆分每一位上的数字并打印

        公式：
        个位：数值 % 10
        十位：数值 / 10 % 10
        百位：数值 / 100 % 10
        千位：数值 / 1000 % 10
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个三位数：");
        int num = sc.nextInt();

        int hundreds = num / 100 % 10;
        int tens = (num / 10) % 10;
        int units = num % 10;

        System.out.println(" 百位: " + hundreds);
        System.out.println(" 十位: " + tens);
        System.out.println(" 个位: " + units);
    }
}
