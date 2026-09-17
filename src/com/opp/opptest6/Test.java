package com.opp.opptest6;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("武明坤");
        s.setAge(18);
        s.setHeight(175);
        s.setWeight(65);

        //1.大一：输出所有信息，行为
        System.out.println(s.getName() + " " + s.getAge() + " " + s.getHeight() + " " + s.getWeight());
        s.study();
        s.setAge(s.getAge() + 1);

        //2.大二：体重 + 10
        s.setWeight(s.getWeight() + 10);
        System.out.println(s.getName() + " " + s.getAge() + " " + s.getHeight() + " " + s.getWeight());
        s.setAge(s.getAge() + 1);

        //3.大三：身高 + 2，体重 - 3
        s.setWeight(s.getWeight() - 3);
        System.out.println(s.getName() + " " + s.getAge() + " " + s.getHeight() + " " + s.getWeight());
        s.setAge(s.getAge() + 1);

        //4.大四：毕业打印所有信息
        s.setAge(s.getAge() + 1);
        System.out.println(s.getName() + " " + s.getAge() + " " + s.getHeight() + " " + s.getWeight());

    }
}
