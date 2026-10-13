package com.oop_advanced.oop_abstract.test1;

public class Test {
    /*
    * 抽象类和抽象方法注意事项（演示在test2包）：
    * 注意点1：抽象类不能实例化 （即不能 new 抽象类的对象）
    *
    * 注意点2：抽象类中不一定有抽象方法
    *           作用：不让外界创建本类的对象
    *         有抽象方法的类一定是抽象类
    *
    * 注意点3：抽象类中可以有构造方法
    *           作用：为了给成员变量赋值
    *
    * 注意点4：抽象类的子类
    *           要么重写抽象类中的所有抽象方法
    *           要么子类也是抽象类（意义不大）
    * */

    public static void main(String[] args) {
        Cat c = new Cat("小花", "白色");
        System.out.println(c.getName() + "," + c.getColor());
        c.eat();
        c.catchMouse();
        c.drink();
    }
}
