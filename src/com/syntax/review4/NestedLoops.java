package com.syntax.review4;

public class NestedLoops {
    public static void main(String[] args) {

        for (int i = 1; i <=3 ; i++) {         // prints 3 lines

            System.out.println(i);

            for (int j = 1; j <=4 ; j++) {  // prints numbers 1-4

                System.out.println(j);
            }

        }

        System.out.println("**********************************");


        for (int i = 1; i <5 ; i++) {
            System.out.println("Hello");

            for (int j = 1; j <=2 ; j++) {
                System.out.println("Bye");
            }

        }











    }
}
