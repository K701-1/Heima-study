package com.heima.method;

public class MethodDemo1 {

    //方法的好处：代码复用，提高代码的可读性和可维护性

    //练习：定义一个方法，求两个数的和

    /*

    定义格式：public static 返回值类型 方法名(参数1，参数2...){
                方法体;
                return 返回值;
            }

    调用格式：方法名(参数1，参数2...);     参数要一一对应（个数，类型）


    注意：方法和方法之间是平级关系，不能嵌套，即不能写在 main 方法内部
         方法需要被调用才能执行方法内部的代码

    */

    public static void main(String[] args) {
        //方法一：
        int result = getSum(10, 20);
        System.out.println(result);

        //方法二：
        System.out.println(getSum(10, 20));
    }

    public static int getSum(int num1, int num2) {
        int sum = num1 + num2;

        //return作用：结束方法，并返回方法的返回值（return只在方法中出现）
        return sum;
    }
}
