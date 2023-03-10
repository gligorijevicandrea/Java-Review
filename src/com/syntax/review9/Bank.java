package com.syntax.review9;

public class Bank {

    public static void main(String[] args) {

        // getter and setter from private method
        Customer c=new Customer();
        c.setName("Slava Friz");  // set
        System.out.println("Name of the customer is "+c.getName());  // get

        c.setSsn(1233435);
        System.out.println("SSN of the customer is "+c.getSsn());


        // getter and setter from private constructor
        PrivateClient pc=new PrivateClient("Dianna Hanna",122424333);
        System.out.println("Private client name "+pc.getName());
        System.out.println("Private client ssn "+pc.getSsn());



    }
}
