package com.heima.array;

import java.util.Scanner;

public class ArrayDemo4 {
    public static void main(String[] args) {

        //数组的动态初始化

        //完整格式：数据类型[] 数组名 = new 数据类型[数组长度];
        int[] arr = new int[5];

        Scanner sc = new Scanner(System.in);
        //创建后数组内默认值为0
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入一个整数：");
            int num = sc.nextInt();
            arr[i] = num;
        }

        //遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
