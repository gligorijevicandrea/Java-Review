package com.syntax.review4;

public class NestedLoops2 {
    public static void main(String[] args) {

        for (int i = 0; i <=3 ; i++) {
            System.out.println(i);        // 0 1 2 3

            for (int j = 1; j >=3 ; j++) {
                System.out.println(j);
            }

        }

        System.out.println("*********************");


        for (int i = 0; i <=3 ; i++) {   // for one time of this

            for (int j = 1; j <=3 ; j++) {  // prints out 1 2 3 , until it finishes , than goes back to outer loop
                System.out.println(j);
            }

        }

        System.out.println("*******CAR***********");

        // once l reaches 9, it goes to k ,
        // k increments for 1 ,l goes back to  0 , k stays 1 until l reaches 9
        // once l is 9 , k increments to 2 , l goes back to 0 until reaches 9
        // once l is 9 , k increments to 3 , l goes back to 0 until reaches 9

        for (int i = 0; i <=9 ; i++) {

            for (int j = 0; j <=9 ; j++) {
                System.out.println(i);

                for (int k = 0; k <=9; k++) {

                    for (int l = 0; l <=9; l++) {

                        System.out.println(i+" "+j+" "+k+" "+l);
                    }
                }

            }
        }









    }
}
