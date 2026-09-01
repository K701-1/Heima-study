package com.heima.loopfor;

import java.util.Scanner;

public class ForDemo7 {
    public static void main(String[] args) {
        /*
        数列之和（牛客）
            计算数列前n项的和：
                S(n)=1-2+3-4=-2
                输入：4
                输出：-2
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入n的值：");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++){
            if(i % 2 == 0) sum -= i;
            else sum += i;
        }
        System.out.println("数列前" + n + "项的和为：" + sum);
    }
}
