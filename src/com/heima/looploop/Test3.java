package com.heima.looploop;

public class Test3 {
    public static void main(String[] args) {
        //目标：输出输出五行五列的倒三角形

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
