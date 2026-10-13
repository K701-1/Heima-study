package com.oop_advanced.oop_interface.test1;

public class Test {
    /*
    * 接口中成员变量的特点：
    * 1. 默认是public static final的
    * 2. 没有构造方法
    * 3. 成员方法只能是抽象方法（JDK7及以前）
    *    JDK 8 起还允许 default 默认方法、static 静态方法；
    *    JDK 9 起还支持 private 方法
    * */
    public static void main(String[] args) {
        Frog frog = new Frog("小青青", "青色");
        System.out.println(frog.getName() + "," + frog.getColor());
        frog.eat();
        frog.swim();
    }
}
