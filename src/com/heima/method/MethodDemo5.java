package com.heima.method;

public class MethodDemo5 {
    /*
    比较面积大小，判断哪个更大
    如何定义方法

    1.观察在大段代码中，重复使用的独立功能，可以定义成方法（确定是否需要定义方法）
    2.这个独立功能，需要什么完成（确定形参）
    3.方法调用处，是否需要这个独立功能结果做其他事（确定是否需要返回）

    */
    public static void main(String[] args) {
        double area1 = compareArea(10.1, 20.1);
        double area2 = compareArea(10.1, 2.1);

        if (area1 > area2) System.out.println("面积1更大");
        else if (area1 < area2) System.out.println("面积2更大");
        else System.out.println("面积相等");

    }

    public static double compareArea(double len, double wid) {
        return len * wid;
    }

}
