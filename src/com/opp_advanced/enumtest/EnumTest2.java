package com.opp_advanced.enumtest;

public class EnumTest2 {
    public static void main(String[] args) {
        /*
        枚举的注意事项：
            1.每一个枚举项，都是该枚举类的对象，每一个对象都是通过构造方法创建的
            2.枚举类在底层就是常量，默认是public static final修饰
            3.枚举类的第一行必须是枚举项，枚举项直接用逗号分隔，分号结尾
            4.枚举类的构造方法可以是private，私有的，不让外部创建对象
            编译器默认会为枚举类新增两个默认存在的方法：values()和valueOf()

            values()方法：获取当前枚举类所有枚举项组成的数组
            valueOf()方法：获取指定名称的枚举项，相当于OrderState.
         */

        OrderState o1 = OrderState.PROCESSING;
        System.out.println(o1.getName());

        OrderState[] arr = OrderState.values();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("-------------------------------");

        OrderState shipped = OrderState.valueOf("SHIPPED");
        System.out.println(shipped);
    }

}
