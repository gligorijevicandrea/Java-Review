package com.syntax.review8;

import com.syntax.review7.Car;

public class Bmw extends Car {
    public Bmw(String make, String model) {
        super(make, model);
    }

    public void start(){
        System.out.println(make+" starts with push start button");
    }

    // we are overriding method drive from Car class
    // public is accesses modifier , return type is String
    public String drive(String typeOfDriving){
        System.out.println(make+" drives "+typeOfDriving);
        return typeOfDriving;
    }

    void brake(){
        System.out.println(make+" brakes");
    }


}
