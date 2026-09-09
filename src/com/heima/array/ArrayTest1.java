package com.heima.array;

import java.util.Scanner;

public class ArrayTest1 {
    public static void main(String[] args) {
        /*
        需求：已知数组{33，5,22,44,55,33}
        键盘录入一个数据，查找这个数据是否存在
        如果数据中要查找的出现多次，只要第一次的索引
        输出要求：
                如果存在打印索引
                如果不存在，提示：该数据不存在
        */

        int[] arr = {33,5,22,44,55,33};

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数据：");
        int num = sc.nextInt();

        //作用：记录数组当中是否存在num false：不存在 true：存在
        boolean flag = false;

        //或使用计数器count

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                System.out.println(i);
                flag = true;
                //count++
                break;
            }

        }
        if(!flag){      //count == 0
            System.out.println("该数据不存在");
        }
    }
}
