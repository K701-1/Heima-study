package com.heima.looploop;

public class Test1 {
    public static void main(String[] args) {

        /*
        嵌套循环，先看内循环，外循环是重复执行内循环
        目标：输出  *****
                  *****
                  *****
                  *****
         */

        //     System.out.println();     先打印，再换行
        //     System.out.print(i);      只打印，不换行

        for (int i = 1; i <= 4; i++) {
            //一行打印五个星号
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            //换行
            System.out.println();
        }

    }
}
