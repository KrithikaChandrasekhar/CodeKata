package com.avkc.basics;

public class Toggle {


    public static int count = 0;
    public Toggle() {
        count++;
    }

    boolean state = false;

    Toggle next;

    public void toggle() {
        state = !state;
    }

    public boolean getState() {
        return state;
    }

    public static int getLength(String s) {
        return s.length();
    }
}
