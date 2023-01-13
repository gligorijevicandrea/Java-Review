package com.syntax.review1;

import java.sql.SQLOutput;

public class WorkingWithVariables {
    public static void main(String[] args) {
        int number=10;

        int num;
        num=100;
        num=200;  // reassign the value;

        System.out.println(num); // 200

        boolean hungry=false;
        hungry=true;

        String myString="Hello"; // String is the most popular
        String name="Asel";
        String address="123 Test Drive";

        System.out.println(myString+" "+name);

        int age=21;

        System.out.println(name+" is "+age+" years old"); // + attaches the things to make sentence

        System.out.println(num+number); // + acts as addition

        String n1="10";
        System.out.println(n1+num);

        String month="December";
        int day=14;

        System.out.println(day+" "+month);





    }
}
