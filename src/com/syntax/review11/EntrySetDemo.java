package com.syntax.review11;

import java.util.HashMap;
import java.util.Map;

public class EntrySetDemo {
    public static void main(String[] args) {

        Map<String,Double> fruitMap= new HashMap<>();
        fruitMap.put("Apple",12.5);
        fruitMap.put("Banana",4.9);
        fruitMap.put("Dragon fruit",5.6);
        fruitMap.put("pear",16.5);
        fruitMap.put("Orange",15.5);
        fruitMap.put("Mango",10.6);

        // print only those elements which contain letter a or e in their name
        // and their price is more than $8

        var entrySet=fruitMap.entrySet();  // old java doesn't have var

        for(var entry:entrySet){
            String key=entry.getKey();
            if((key.contains("a") || key.contains("e")) && entry.getValue()>8){ // put () so || condition will print first
                System.out.println(key+" "+entry.getValue()); // or sout(entry);
            }
        }










    }
}
