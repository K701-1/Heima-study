package com.heima.array;

import java.util.Random;

public class ArrayTest4 {
    public static void main(String[] args) {
        //已知数组元素{8,2,3,4,5,6,7,1,9,10}
        //要求：打乱数组中的数据

        int[] arr = {8,2,3,4,5,6,7,1,9,10};
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            //i:索引  arr[i]:元素

            //获得一个随机的索引
            int randomIndex = r.nextInt(arr.length);
            //拿索引i的元素和随机索引的元素进行交换
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

        //遍历，输出结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
