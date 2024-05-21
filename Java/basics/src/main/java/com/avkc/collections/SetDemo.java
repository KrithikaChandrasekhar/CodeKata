package com.avkc.collections;

import com.avkc.basics.Student;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        System.out.println(set.add("123"));
        System.out.println(set.add("123"));
        System.out.println(set.contains("123"));


        Set<Student> treeSet = new TreeSet<>(new MyComparator());
    }

    public static class MyComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            if(o1.getRollNo() < o2.getRollNo()) {
                return -1;
            } else if(o1.getRollNo() >= o2.getRollNo()) {
                return 1;
            }
            return 0;
        }
    }
}
