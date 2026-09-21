package com.oppadvanced.finaltest;

public class FinalTest2 {
    /*
        定义一个JavaBean类描述圆
            属性：半径，圆周率
            方法：计算面积，计算周长
    */
    public static void main(String[] args) {
        Circle c = new Circle(1.5);

        System.out.println(c.getRadius() + "," + c.getPI());

        System.out.println(c.getArea());
        System.out.println(c.getLength());

    }
}
