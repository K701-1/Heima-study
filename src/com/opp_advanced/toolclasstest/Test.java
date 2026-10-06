package com.opp_advanced.toolclasstest;

public class Test {
    public static void main(String[] args) {
        //1.提供一个方法 printArr ，用来遍历数组
        //2.提供一个方法getAverage，用于返回平均分

        //定义一个数组
        int[] arr1 = {1, 2, 3, 4, 5};
        //调用方法遍历
        ArrayUtil.printArr(arr1);


        int[] arr2 = {3,4,5,6,7};
        //点击方法， ctrl + alt + v 自动生成左边的接受变量
        double average = ArrayUtil.getAverage(arr2);
        System.out.println("平均值为：" + average);
    }
}
