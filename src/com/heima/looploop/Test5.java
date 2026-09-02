package com.heima.looploop;

public class Test5 {
    public static void main(String[] args) {

        //拆分思想（长方形，正倒三角形）

        for (int i = 1; i <= 3; i++) {
            for (int j = i; j <= 2; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= 3; j++) {
                System.out.print("*");
            }

            for (int j = i; j <= 2; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
