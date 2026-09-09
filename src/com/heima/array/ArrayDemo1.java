package com.heima.array;

public class ArrayDemo1 {
    public static void main(String[] args) {

        //数组格式：数据类型[] 数组名 = new 数据类型{};
        //简写：数据类型[] 数组名 = {元素1,元素2,元素3,...};

        /*
        数组的静态初始化：
            1.定义数组存储3位同学年龄
            2.定义数组存储5位同学身高
            3.定义数组存储3位同学姓名
          */

        int[] ageArr1 = new int[]{18, 19, 20};
        int[] ageArr2 = {18, 19, 20};


        double[] heightArr = {1.75, 1.76, 1.77, 1.78, 1.79};
        String[] nameArr = {"zhangsan", "lisi", "wangwu"};


    }
}
