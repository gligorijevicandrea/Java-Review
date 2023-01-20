package com.syntax.review4;

public class NestedLoop3 {
    public static void main(String[] args) {

        // we get 4 hello , 1 bye

        for (int i = 1; i <=3 ; i++) {

            for (int j = 1; j <=4 ; j++) {

                System.out.println("Hello");
            }
            System.out.println("Bye");
            break;
        }

        System.out.println("*************");

        // After each Hello , one Bye

        for (int i = 1; i <=3 ; i++) {

            for (int j = 1; j <=4 ; j++) {

                System.out.println("Hello");
                break;
            }
            System.out.println("Bye");

        }

        System.out.println("**********************");

       //  one HEllo , one Bye

        for (int i = 1; i <=3 ; i++) {

            for (int j = 1; j <=4 ; j++) {

                System.out.println("Hello");
                break;
            }
            System.out.println("Bye");
            break;
        }










    }
}
