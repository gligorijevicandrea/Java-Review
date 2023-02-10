package com.syntax.review7;

public class Tesla extends Car{ // Car class super/parent class  of Tesla class

    String type;
    boolean autoPilot;





    Tesla(String make,String model,int year, int horsePower,String type,boolean autoPilot){   // subclass/child Tesla of a Car class
        super(make,model,year,horsePower);                // calling parent class constructors by super
        this.type=type;
        this.autoPilot=autoPilot;

    }

    protected void haveAutopilot(){
        System.out.println(make+" have autopilot "+autoPilot);
    }



}
