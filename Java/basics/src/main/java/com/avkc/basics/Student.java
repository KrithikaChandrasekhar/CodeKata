package com.avkc.basics;

public class Student {

    public Student(String name) {
        this.name = name;
        rollNo = ++rollNoCounter;
    }

    private static int rollNoCounter = 0;
    int rollNo;
    String name;

    void attendClass() {

    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }
}
