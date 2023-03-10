package com.syntax.review10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {

        Map<String, Double>grocery=new HashMap<>();

        // to store values inside the map
        grocery.put("Milk",5.99); // K+V = Entry Object
        grocery.put("Eggs",6.50);
        grocery.put("Bread",2.99);
        grocery.put("Tea",4.99);
        grocery.put("Cucumber",2.50);
        grocery.put("Eggs",7.99); // same item(key) ,just different price.. it will update the value(price)
        grocery.put("Tomato",2.50);
        grocery.put(null,null);
        // keys can't be duplicate , but the value can


        double teaPrice =grocery.get("Tea"); // Returns the value to which the specified key is mapped
        System.out.println(teaPrice);

        System.out.println(grocery);

        int size= grocery.size();
        System.out.println("Number of entry objects "+size);

        Map<String , Double>lmap =new LinkedHashMap<>();
        lmap.put("Milk",5.99); // K+V = Entry Object
        lmap.put("Eggs",6.50);
        lmap.put("Bread",2.99);
        lmap.put("Tea",4.99);
        lmap.put("Cucumber",2.50);
        lmap.put("Eggs",7.99); // same item(key) ,just different price.. it will update the value(price)
        lmap.put("Tomato",2.50);
        lmap.put(null,null);

        System.out.println("Order is preserved "+lmap);

        Map<String, Double> tmap=new TreeMap<>();  // sorts in alphabetic order
        tmap.putAll(grocery);
        tmap.putAll(lmap);  // no duplicates allowed so size of lmap is 6

        System.out.println("Size ="+tmap.size());
        System.out.println("Sorted Order "+tmap);


    }
}
