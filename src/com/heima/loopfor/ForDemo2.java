package com.heima.loopfor;

public class ForDemo2 {
    public static void main(String[] args) {
        /*
        * 需求：在实际开发中，如果要获取一个范围中的每个数据时，就会用到循环
        * 要求1：打印1-5
        * 要求2：打印5-1
        * */

        for (int i = 1;i <= 5;i ++){
            System.out.println(i);
        }

        for (int a = 5;a >= 1;a --){
            System.out.println(a);
        }
    }
}
