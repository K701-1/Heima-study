package com.heima.method;

import java.sql.SQLOutput;

public class MethodDemo3 {
    //定义一个方法遍历数组，格式：[1, 2, 3, 4, 5]

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        printArr(arr);
    }

    //没有返回值的，不需要把方法中的结果返回调用处，返回值类型写 void
    public static void printArr(int[] arr) {

        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i] + ", ");
            }
        }

        System.out.println("]");
    }
}
