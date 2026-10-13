package com.opp_advanced.oop_interface.test5;

public interface Inter {
    public abstract void method1();
    public abstract void method2();

    // 默认方法
    //public default 返回类型 方法名（形参）{方法体}
    public default void function(){
        System.out.println("接口中新增的的默认方法");
    }
}
