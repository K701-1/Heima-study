package com.opp_advanced.oopextends.test8;

public class GeneralTeacher extends Teacher {
    public GeneralTeacher() {
    }

    public GeneralTeacher(String subject) {
        super(subject);
    }

    @Override
    public void teach() {
        System.out.println("通识课老师正在教" + getSubject());
    }
}
