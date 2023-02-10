package com.syntax.review7;

public class Car {

    String make,model;  // variables ==>

    int year,horsePower;

    //this is instance variable / constructor ==>
    public Car(String make,String model){  // method car , public modifier
        this.make=make;
        this.model=model;

    }
    public Car(String make,String model,int year,int horsePower){  // this constructor is accessing 4 parameters
        this(make,model);    // to call current class constructor , argument constructor
        this.year=year;
        this.horsePower=horsePower;  // this accessing/referring to instance variables

    }

    // methods ==>

    public void start(){
        System.out.println(make+" starts");
    }

    public void drive(int speed){
        System.out.println(make+" drivers with speed "+speed);
    }

    //  all of this up we created before inheritance

    //METHOD OVERLOADING ==>

    // same class have 2 or more methods with same name = Method Overloading
    // how to implement ? different numbers of parameters,different types , sequence
    protected String drive(String destination){  // overloading by different types
        System.out.println(make+" drives to "+destination);
        return destination;
    }

     void drive(int speed,String destination){  // by different number of parameters
        System.out.println(make+" drive to "+destination+" with speed = "+speed);
    }

    public void drive(String destination,int speed){  // by sequence
        System.out.println(make+" drive to "+destination+" with speed = "+speed);

    }


    /*
       private void drive(int wheel){}  - NO
       by changing access modifiers we are not overloading!



    String drive(String destination){   - NO
        return destination;

    }
     we cannot overload methods by changing it is return type

     In overloading methods signature MUST BE DIFFERENT
     method signature involves name and parameters only !!!

     In overloading we don't care about return type ( can be changed) or access modifiers (can be different)

    */




}
