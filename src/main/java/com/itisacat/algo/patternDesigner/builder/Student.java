package com.itisacat.algo.patternDesigner.builder;

public class Student {
    private String name;
    private Integer age;

    private Student(StudentBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    public static class StudentBuilder {
        private String name;
        private Integer age;

        public StudentBuilder() {
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
