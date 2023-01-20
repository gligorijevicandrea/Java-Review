package com.syntax.review4;

import java.util.Scanner;

public class WhileLoopsDoWhile {
    public static void main(String[] args) {

        // while loop - when we don't know how many times we will repeat the code

        int a=1;

        while(a>=3){
            System.out.println("I am while loop");
            a++;
        }

        // do while - when we don't know how many times we will repeat the code
        //          - executes code even the statement is false

        int b=1;

        do{
            System.out.println("Do while");
            b++;
        }while (b>=3);


        //  Ask students if they understand loop?
        // if they don't --> tell them to practice more on loops
        // if they understand --> you good move to array concept

        Scanner scan=new Scanner(System.in);
        String answer;
        do {
            System.out.println("Do you understand loops in Java?");
            answer = scan.nextLine();

        } while(!answer.equalsIgnoreCase("yes")); // it will keep asking if the answer is not equal to yes

        System.out.println("Great job,let's learn arrays now");










    }
}
