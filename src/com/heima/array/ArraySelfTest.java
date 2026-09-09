package com.heima.array;

import java.util.Random;

public class ArraySelfTest {
    public static void main(String[] args) {
        //需求：获取十个 0-100 之间的随机数并存入数组，保证数据是唯一的

        int[] arr = new int[10];
        Random r = new Random();

        for (int i = 0; i < arr.length; ) {
            int num = r.nextInt(101);
            int count = 0;

            for (int j = 0; j < i; j++) {
                if (num == arr[j]) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                arr[i] = num;
                i++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
