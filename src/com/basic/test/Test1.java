package com.basic.test;

public class Test1 {
    /*
     * 移除元素
     * 给定一个数组和一个值，移除数组中所有等于给定值的元素，并返回移除后的数组长度。
     * 例如，给定数组 [3,2,2,3] 和值 3，移除所有等于 3 的元素后，数组变为 [2,2]，返回数组长度 2。
     */
    public static void main(String[] args) {
        // 定义一个数组
        int[] arr = new int[]{1, 1, 2, 2, 3, 3, 3, 3};
        // 定义一个值
        int val = 3;

        //利用快慢指针删除变量
        int slow = 0;
        int fast = 0;

        while (fast < arr.length) {
            if (arr[fast] != val) {
                //如果快指针当前位置不是 val ，则将这个数字存入慢指针位置，慢指针快指针++
                arr[slow] = arr[fast];
                slow++;
            }
            fast++;
        }

        //遍历数组
        for (int i = 0; i < slow; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("数组长度为：" + slow);
    }
}
