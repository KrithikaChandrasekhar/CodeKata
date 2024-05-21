package com.avkc.streams;

import com.avkc.basics.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("arv"));
        list.add(new Student("frooty"));
        list.add(new Student("KC"));
        list.add(new Student("AV"));

        String names = list.stream()
                .map(Student::getName)
                .filter(name->name.startsWith("a"))
                .findAny()
                .orElseGet(() -> "");

    }
}
