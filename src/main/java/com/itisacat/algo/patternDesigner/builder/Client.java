package com.itisacat.algo.patternDesigner.builder;

public class Client {
    public static void main(String[] args) {
        Student s = new Student.StudentBuilder().setName("lily").setAge(18).build();
        System.out.println(s);
    }
}
