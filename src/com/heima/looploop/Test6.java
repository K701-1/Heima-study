package com.heima.looploop;

public class Test6 {
    public static void main(String[] args) {
        //打印梯形

        for (int i = 1; i <= 3; i++) {
            for (int j = i; j <= 2; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j < 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
