package com.avkc.basics;

public class TeslaCar extends Car implements Flyable{
    @java.lang.Override
    public void fly() {

    }

    @java.lang.Override
    public void changeGear() {
        super.changeGear();
        System.out.println("Tesla change gear");

    }


}
