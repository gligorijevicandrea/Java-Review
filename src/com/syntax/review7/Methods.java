package com.syntax.review7;

public class Methods {

        // 2 types of modifiers: -access : public,protected,default,private
    //                           -non access : static
    // user defined : with return type and without
    //                  with parameters and without

    // void is return type

    void hello(){ // method without parameters
        System.out.println("Hello");
    }

    void sayHello(String name){  // method with parameters , // non static method , to access it we need to create an object
        System.out.println("Hello "+name);
    }

    // create a method that returns the largest number between given 2 integer values

    int findLargest(int num1,int num2){  // method return type is integer
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }
    }

    // create a method that returns an average value of 2 decimal values


    private double findAverage(double num1,double num2){
        return (num1+num2)/2;   // we need to add return key word
    }

    // create a method that returns reversed String from a given String

    protected StringBuilder reversed(String given){ // string method accepts one parameter as string // if we add here String Builder instead String
        StringBuilder sb=new StringBuilder(given);
        return sb.reverse(); // toString();  // we need to add to String this string builder , if it stayed a string
    }


    // create a method that will return a min value from given array

    // static means method belongs to the class , so we don't need class name and object
    public static int minFromArray(int[]array){   // (int[]array) parameters ,  int minFromArray method
        //or int array={10,20}; instead of  (int[]array)
        int min=array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]<i){
                min=array[i];
            }
        }
        return min;
    }


    public static void main(String[] args) {

        String name="Mohammed";

        int characters=name.length();  // method length returns some value
        System.out.println(characters);

        Methods obj=new Methods();

        obj.sayHello(name); // when we call this method , it doesn't return any values

        int largest=obj.findLargest(100,200);
        System.out.println("The largest number is "+largest);


        System.out.println(obj.findAverage(10,30));
                    //   obj is variable where we are accessing the method 10,30

        StringBuilder reversed=obj.reversed("Hello");// method returns the values of the String // here we new to add StringBuilder reverse
        System.out.println(reversed);
        // return value should be the same as specified value

        String myString="Batch 15";
        myString.toUpperCase().isEmpty();
        // myString is String value , when we call method toUppercase is String, isEmpty is boolean value

        boolean empty=myString.toUpperCase().isEmpty(); // at the end isEmpty returns boolean value

        char character=myString.trim().charAt(2);
        // myString is String , trim is new String , method charAt(2) returns char type C
        System.out.println(character);


        int []array={10,49,89,60};
        Methods.minFromArray(array);
        int minimum=minFromArray(array); // just like this because is static // when we want to return something
        System.out.println("Minimum number is "+minimum);

    }

}
