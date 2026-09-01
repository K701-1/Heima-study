package com.heima.loopfor;

import java.util.Scanner;

public class ForDemo5 {
    public static void main(String[] args) {
        //键盘录入两个数字，表示一个范围，统计范围中既能被 3 整除，又能被 5 整除的数字个数
        //统计思想：count = 0 --> count++

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个数字：");
        int num2 = scanner.nextInt();

        int count = 0;
        for (int i = num1; i <= num2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
            }
        }
        System.out.println("既能被3整除，又能被5整除的数字个数为：" + count);
    }
}
