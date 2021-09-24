package com.example.lib01.model;

public class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
        this("",0);
    }
}
