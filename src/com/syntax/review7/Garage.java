package com.syntax.review7;

public class Garage {

    public static void main(String[] args) {

        // variable=            this is all object
        Tesla tesla = new Tesla("Tesla", "S", 2022, 340, "electric", true);

        // from super class
        tesla.start();
        tesla.drive(100);

        // from Tesla class - subclass
        tesla.haveAutopilot();
        tesla.drive("Miami");


        // Overriding = is when we have the same method name in 2 DIFFERENT class (Parent - Child)
        // In overriding = INHERITANCE is a MUST
        // In Overriding = method signature should be the SAME


    }


}
