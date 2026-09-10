package com.heima.method;

import java.util.Random;

public class MethodDemo2 {

    //去除重复元素（力扣算法）：获取10个 1-100 之间的随机数存入数组，保证数据唯一

    public static void main(String[] args) {

        int[] arr = new int[10];

        Random r = new Random();
        for (int i = 0; i < arr.length; ) {     // i 为外循环的索引，即随机数要存入的位置
            int num = r.nextInt(100) + 1;
            //对 num 进行判断
            int count = 0;

            //调用方法,对num判断是否存在
            boolean flag =contains(num, arr);

            if (flag) {
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

    //定义一个方法，判断 num 是否在 arr 中存在
    public static boolean contains(int num, int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i]){
                //如果遇到符合条件，返回 ture ，方法直接结束
                return true;
            }
        }
        //循环结束没找到，返回 false
        return false;
    }
}
