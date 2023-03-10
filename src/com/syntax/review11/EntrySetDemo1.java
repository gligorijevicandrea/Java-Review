package com.syntax.review11;

import java.util.HashMap;
import java.util.Map;

public class EntrySetDemo1 {
    public static void main(String[] args) {


        Map<String,Double> fruitMap= new HashMap<>();
        fruitMap.put("Apple",12.5);
        fruitMap.put("Banana",4.9);
        fruitMap.put("Dragon fruit",5.6);
        fruitMap.put("pear",16.5);
        fruitMap.put("Orange",15.5);
        fruitMap.put("Mango",10.6);
        //fruitMap.forEach((x,y)-> System.out.println(x+y)); // new mechanism inside Maps and collection frames , loop through all elements-print them, similar to for each loop

        // Remove only those elements which contain letter a or e in their name
        // and their price is more than $8
        // we are going to use LAMBDA expression  x-> remove If method

        fruitMap.entrySet().removeIf(entry-> (entry.getKey().contains("a")|| entry.getKey().contains("e")) && entry.getValue()>8);
        System.out.println(fruitMap);










    }
}
