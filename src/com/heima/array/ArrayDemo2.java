package com.heima.array;

public class ArrayDemo2 {
    public static void main(String[] args) {

        //数组元素的访问

        //静态初始化创建数组
        int[] arr = {10, 20, 30, 40, 50};
        //对应        0   1   2   3   4
        //访问数组元素：数组名[索引]

        //索引：从0开始，表示数组元素的编号

        //获取格式：数组名[索引]
        System.out.println(arr[0]);

        //修改格式：数组名[索引] = 新值
        arr[0] = 100;
        System.out.println(arr[0]);
    }
}
