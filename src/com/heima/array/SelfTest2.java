package com.heima.array;

import java.util.Arrays;

public class SelfTest2 {

    //合并有序数组（力扣算法）

    /*

    给你两个有序数组 arr1 和 arr2，将两个数组中的数据合并到一个大数组中。

    要求：合并之后的大数组也是有序的。

    举例1：
    arr1：1 3 5 7 9
    arr2：2 4 6 8 10
    arr3：1 2 3 4 5 6 7 8 9 10

    */

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;   // i、j 分别扫描两个数组，k 指向结果位置

        // 两边都未走完时，小者优先放入 arr3
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }
        // 拷贝 arr1 的剩余元素（若已走完则不执行）
        while (i < arr1.length) arr3[k++] = arr1[i++];
        // 拷贝 arr2 的剩余元素
        while (j < arr2.length) arr3[k++] = arr2[j++];

        return arr3;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        System.out.println(Arrays.toString(merge(arr1, arr2)));
        // 期望 [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        // 边界测试：长度不等，剩余段拷贝生效
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(merge(a, b)));
    }
}
