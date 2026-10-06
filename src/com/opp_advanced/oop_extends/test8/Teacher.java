package com.opp_advanced.oop_extends.test8;

public class Teacher {
    private String subject;

    //构造方法
    public Teacher() {
    }

    public Teacher(String subject) {
        this.subject = subject;
    }

    //get\set
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void teach() {
        System.out.println("教" + subject);
    }
}
