package com.opp_advanced.oop_interface.test6;

public interface Inter {

    public default void login(){
        check1();
        System.out.println("执行登录的逻辑~");
    }

    public static void register(){
        check2();
        System.out.println("执行注册的逻辑~");
    }

    //普通私有方法：private 返回值类型 方法名(形参) {方法体}
    private void check1(){
        System.out.println("检查网络~");
        System.out.println("检查用户名和密码的格式~");
        System.out.println("检查用户名是否存在~");
    }

    //静态私有方法：private static 返回值类型 方法名(形参) {方法体}
    private static void check2(){
        System.out.println("检查网络~");
        System.out.println("检查用户名和密码的格式~");
        System.out.println("检查用户名是否存在~");
    }
}
