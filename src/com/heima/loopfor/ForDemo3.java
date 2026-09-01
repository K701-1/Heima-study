package com.heima.loopfor;

public class ForDemo3 {
    public static void main(String[] args) {
        /*
        * 需求：在实际开发中，如果要获取一个范围中的每个数据时，就会用到循环
        * 要求：求 1-5 之间的和
        * */

        int sum = 0;

        for (int i = 1;i <= 5;i ++){
            sum += i;
        }

        System.out.println("1-5之间的和是：" + sum);
    }
}
