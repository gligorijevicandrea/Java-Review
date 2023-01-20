package com.syntax.review4;

public class BreakContinueForLoop {
    public static void main(String[] args) {

        // we use For Loop  when we know how many times we want to repeat the block of code
        // break

        for(int i=2; i<=20; i+=5){
            System.out.println(i);

            if(i==12){
                System.out.println("i is equal to 12 - I am breaking my loop");
                break;          // it stops running once number equals to 12
            }

        }

       // continue - skips current iteration

        for (int i = 1; i <=10 ; i++) {

            if(i%3==0){
                System.out.println(i);
                continue;  // goes back to beginning of loop or skips the rest of code

            }
            System.out.println("Hello"); // it will print Hello when number is not divisible with 3
            System.out.println("How are you?");
            System.out.println("Hope you are well");
        }














    }
}
