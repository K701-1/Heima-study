package com.heima.method;

public class MethodDemo6 {

    //方法的重载：同一个类中，定义了多个同名的方法，参数列表不同，根据调用时输入的参数自动匹配方法
    //参数类型不同，参数个数不同，参数顺序不同

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //调用形参实参数据类型一一对应的方法（查看：点击调用的方法，IDEA中会高亮显示）
        System.out.println(getSum(a, b));
    }

    public static int getSum(int a, int b){
        return a + b;
    }

    //如果参数类型不同，两个参数同时需要转换时，编译器无法选择，会报错，以下两个二选一留下即可
    public static double getSum(int a, double b){
        return a + b;
    }
//    public static double getSum(double a, int b){
//        return a + b;
//    }


    public static double getSum(double a, double b){
        return a + b;
    }
}
