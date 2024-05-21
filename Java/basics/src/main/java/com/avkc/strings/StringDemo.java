package com.avkc.strings;

public class StringDemo {

    public static void main(String[] args) {
        String s1 = "arv";
        String s2 = "arv";
        String s4 = s1.toUpperCase();
        System.out.println(s1);
        System.out.println(s1==s2);

        String s3 = new String("arv");
        System.out.println(s1==s3);

        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("asd").append("frooty").append(2).append("arbind");
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s4));
    }
    static void method(Integer x , int y){ }
    static void method(Object x , short  y){}


}
