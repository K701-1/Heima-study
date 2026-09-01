package com.heima.controllerloop;

import java.util.Scanner;

public class ContinueDemo3 {
    public static void main(String[] args) {
        //在一行中输入整数n，满足 1 <= n <= 10的五次方，列出 1 到 n 之间所有不包含数字 4 又不是 4 的倍数的整数，升序

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个整数：");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            if(i%4==0||i%10==4||i/10%10==4||i/100%10==4||i/1000%10==4||i/10000%10==4||i/100000%10==4) continue;
            System.out.println(i);
        }
    }
}
