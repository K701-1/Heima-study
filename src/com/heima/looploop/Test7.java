package com.heima.looploop;

public class Test7 {
    public static void main(String[] args) {
        //打印菱形

        for (int i = 1; i <= 3; i++) {
            for (int j = i; j <= 3; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int j = 0; j < 7; j++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (3 - i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
