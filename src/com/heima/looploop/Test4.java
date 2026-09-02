package com.heima.looploop;

public class Test4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {

            for (int j = i; j <= 2; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 6; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
