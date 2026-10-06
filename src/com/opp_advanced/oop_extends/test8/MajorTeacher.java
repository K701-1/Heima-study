package com.opp_advanced.oop_extends.test8;

public class MajorTeacher extends Teacher{
    public MajorTeacher() {
    }

    public MajorTeacher(String subject) {
        super(subject);
    }

    @Override
    public void teach() {
        System.out.println("专业课老师正在教" + getSubject());
    }
}
