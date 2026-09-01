package com.heima.loopfor;

public class ForDemo6 {
    public static void main(String[] args) {
        /*
        数字规律（牛客）            （for，数组，递归）
            有一组特殊数字，从第三项开始，每一项都是前两项数字的和，问：第十项数字
            0,1,1,2,3,5,8,13,21,34，55,89...
        */

        //1.定义变量记录前两项
        int a = 0;
        int b = 1;

        //2.定义一个变量，表示a，b后面的值
        int c = 0;

        //3.利用循环获取每一项
        for (int i = 3; i <= 10; i++) {
            c = a + b;
            a = b;
            b = c;

        }

        System.out.println(c);
    }
}
