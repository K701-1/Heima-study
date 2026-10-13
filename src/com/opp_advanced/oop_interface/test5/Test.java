package com.opp_advanced.oop_interface.test5;

public class Test {
    public static void main(String[] args) {
        /*
        * 接口中的默认方法：
        *    作用：为了接口升级而存在的
        *    格式："public default 返回值类型 方法名(参数列表) {...}"
        *      注意事项：
        *          1. 默认方法不是抽象方法，所以不强制被重写。但是如果被重写，重写的时候去掉"default"关键字
        *          2. "public"可以省略，"default"不能省略
        *          3. 如果实现了多个接口，多个接口中存在相同名字的默认方法，子类就必须对该方法进行重写
        */

        /*
        * 接口中的静态方法：
        *    作用：为了接口升级而存在的
        *    格式："public static 返回值类型 方法名(参数列表) {  }"
        *    注意事项：
        *        1. 静态方法只能通过接口名调用，不能通过实现类名或者对象名调用
        *        2. "public"可以省略，"static"不能省略
        */

        // 创建接口的实现类对象并调用
        Inter ii = new InterImpl();
        ii.function();
    }
}
