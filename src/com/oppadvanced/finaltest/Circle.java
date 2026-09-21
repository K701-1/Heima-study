package com.oppadvanced.finaltest;

public class Circle {
    private double radius;//半径
    private final double PI = 3.14;//圆周率

    //构造方法

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    //get和set方法

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    //行为
    //计算面积
    public double getArea(){
        return PI * radius * radius;
    }
    //计算周长
    public double getLength(){
        return 2 * PI * radius;
    }
}
