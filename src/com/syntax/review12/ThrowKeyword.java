package com.syntax.review12;

public class ThrowKeyword {
    public static void main(String[] args) {

        throwDemo();
    }

    static void throwDemo(){
        throw new NullPointerException(); // new is creating an object of NullPointerException class
        // throw actually throws an object of Exception class


    }
}
