package com.heima.looploop;

public class Test2 {
    public static void main(String[] args) {
        //目标：输出输出五行五列的正三角形

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
