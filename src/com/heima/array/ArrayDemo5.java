package com.heima.array;

public class ArrayDemo5 {
    public static void main(String[] args) {
        //数组常见问题：索引越界

        //索引范围：0~数组长度-1

        int[] arr = {10, 20, 30, 40, 50};

        int index = 10;

        if (index >= 0 && index < arr.length) {
            System.out.println(arr[index]);
        } else {
            System.out.println("索引越界，无效索引：" + index);
        }
    }
}
