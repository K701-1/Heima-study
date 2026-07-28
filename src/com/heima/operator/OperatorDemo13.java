package com.heima.operator;

import java.util.Scanner;

public class OperatorDemo13 {
    public static void main(String[] args) {
        //1.键盘录入一个四位整数，判断是否为回文数

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个四位整数：");
        int num = sc.nextInt();

        //判断回文数
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        int qian = num / 1000 % 10;

//        System.out.println(ge);
//        System.out.println(shi);
//        System.out.println(bai);
//        System.out.println(qian);

        boolean result = ge == qian && shi == bai;
        System.out.println(result);
    }
}
