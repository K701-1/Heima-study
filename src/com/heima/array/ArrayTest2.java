package com.heima.array;

public class ArrayTest2 {
    public static void main(String[] args) {
        //找数组最大值打印

        //细节一：循环开始条件如果为0，对结果没有影响，但会多执行一次，影响效率

        int [] arr = {33,5,44,55,22};
        //细节二：max初始化值不能为 0 ，如果数组中有负值，0就会变成最大值，最好为数组里面的元素
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
