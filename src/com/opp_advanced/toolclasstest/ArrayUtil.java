package com.opp_advanced.toolclasstest;

public class ArrayUtil {
    /*
        静态的注意事项：
            静态方法只能访问静态变量和其他静态方法
            非静态方法可以访问静态变量或静态方法，也可以访问非静态变量和非静态方法
            静态方法里面没有 this 关键字

    */
    private ArrayUtil() {
    }

    //定义方法（静态）
    //1.提供一个方法 printArr ，用来遍历数组
    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ",");
            }
        }
    }

    //2.提供一个方法getAverage，用于返回平均分
    public static double getAverage(int[] arr) {
        //定义一个变量用于存储总和
        int sum = 0;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum * 1.0 / arr.length;
    }

}
