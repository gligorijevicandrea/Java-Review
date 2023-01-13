package com.syntax.review2;

public class Casting {
    public static void main(String[] args) {

        /* Casting : converting one data type to another
        1. widening/implicit/automatic
        smaller to bigger
        */
        double d =5;
        System.out.println(d); // 5.0

        // 2. narrowing/explicit/manual  big to small
        int i=(int)5.0;
        System.out.println(d);  //5

        int num=128;
        byte b=(byte)num;
        System.out.println(b);


    }
}
