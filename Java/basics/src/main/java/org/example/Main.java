package org.example;

import com.avkc.basics.AutoCar;
import com.avkc.basics.Car;
import com.avkc.basics.Toggle;
import com.avkc.basics.Vehicle;

public class Main {
    public static void main(String[] args) {
        Toggle toggleObj = new Toggle();
        System.out.println(toggleObj.getState());
        toggleObj.toggle();
        System.out.println(toggleObj.getState());
        System.out.println(Toggle.count);

        Toggle toggleObj1 = new Toggle();
        System.out.println(toggleObj1.getState());
        System.out.println(Toggle.count);

        Car car = new Car();
        car.changeGear();
        Car autoCar = new AutoCar();
        autoCar.changeGear();
        autoCar.getWheels();
        //Vehicle vehicle = new Vehicle();
    }

    private void gearChange(Car c){

    }
}