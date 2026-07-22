package com.heima.varlable;

import java.util.Scanner;

public class VariableDemo6 {
    public static void main(String[] args) {
        //1.引入scanner类
        //2.使用scanner

        Scanner sc = new Scanner(System.in);

        // 整形
        int num = sc.nextInt();
        System.out.println(num);

        // 浮点型
        double num2 = sc.nextDouble();
        System.out.println(num2);

        //字符串(文本)
        String str = sc.next();
        System.out.println(str);
    }
}
