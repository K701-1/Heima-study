package com.heima.loopwhile;

import java.util.Scanner;

public class WhileDemo4 {
    public static void main(String[] args) {
        /*
        数位之和(牛客)
        给定一个整数n,计算所有数位之和 若 n 为负数,请先计算其绝对值
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = scanner.nextInt();
        int sum = 0;

        //绝对值
        if (num < 0) {
            num = -num;
        }

        //求和
        while (num != 0){
            //获取个位
            sum = sum + num % 10;
            //去掉个位
            num = num / 10;
        }
        System.out.println("数位之和为：" + sum);
    }
}
