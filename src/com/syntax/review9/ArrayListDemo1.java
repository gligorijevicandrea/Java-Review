package com.syntax.review9;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

    public static void main(String[] args) {


        List<String> computers =new ArrayList<>();

        // we stored 4 String objects
        computers.add("Macbook  pro");
        computers.add("HP");
        computers.add("Lenovo");
        computers.add("Dell");

        System.out.println(computers);


        // print out all the elements one by one with Regular For Loop
        for(int i=0; i< computers.size(); i++){
           String c=computers.get(i);  // if(c.equals("HP")) { } sout(I have HP)
            System.out.println(c);
        }

        System.out.println("*****************");

        // print out all the elements one by one with Enhanced Loop
        for(String comp:computers){
            System.out.println(comp+" ");
        }





    }

}
