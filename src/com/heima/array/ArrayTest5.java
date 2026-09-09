package com.heima.array;

import java.util.Random;

public class ArrayTest5 {
    public static void main(String[] args) {
        //需求：获取十个1-100之间的随机数并存入数组，保证数据是唯一的

        //思路：如果存在，不存，生成下一个随机数
        //     如果不存在，存入数组

        //7 79 86 0 59 76 80 56 4 43     出现 0 是因为出现重复的随机数没有存入，默认为 0

        int[] arr = new int[10];

        Random r = new Random();
        for (int i = 0; i < arr.length; ) {     // i 为外循环的索引，即随机数要存入的位置
            int num = r.nextInt(100) + 1;
            //对 num 进行判断
            int count = 0;
            //对num判断是否存在
            for (int j = 0; j < arr.length; j++) {      // j 为内循环的索引，用于遍历数组
                if (num == arr[j]) {
                    count++;
                    //跳出内循环
                    break;
                }
            }

            if (count == 0) {
                arr[i] = num;
                //把外循环i++移到此处，只有生成一个满足要求的随机数，索引才会自增,解决出现0的问题
                //移到此处的结果就是，只有当 i 所在位置数组数据填入后，i才会自增向后移动
                i++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
