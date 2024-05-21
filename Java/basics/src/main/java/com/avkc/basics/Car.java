package com.avkc.basics;

public class Car extends Vehicle{

    public Car() {

    }

    public void changeGear() {
        System.out.println("Car change gear");
    }

    @java.lang.Override
    public int getWheels() {
        return 4;
    }
}
