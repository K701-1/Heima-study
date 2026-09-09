package com.heima.array;

public class ArrayTest6 {
    public static void main(String[] args) {

        //去除递增有序数组重复元素{1,1,2,2,2,2,3,3,3,3}

        //快慢指针

        int[] arr = {1,1,2,2,2,2,3,3,3,3};

        //定义两个指针
        int slow = 0;
        int fast = 1;

        while (fast < arr.length){
            //判断两个指针指向数据是否相同
            if(arr[slow] != arr[fast]){
                slow++;
                arr[slow] = arr[fast];
            }
            fast++;
        }

        //输出结果
        for (int i = 0; i <= slow; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
