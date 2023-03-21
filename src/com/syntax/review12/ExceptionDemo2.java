package com.syntax.review12;

public class ExceptionDemo2 {
    public static void main(String[] args) {

        String name="!Batch 15 is SMART";
        try {
            System.out.println(name.charAt(-1));

        }catch (StringIndexOutOfBoundsException e){

         //   e.printStackTrace(); // it prints the complete info to find out where the error is plus info about fixing that error
            // if we are interested in only the message we can use getMessage method , without printStackTrace();
            // e will print the complete information about the exception class plus the message
            System.out.println(e);
        }catch (NullPointerException npe){
            System.out.println(npe.getMessage());

        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("the rest of the program");




    }
}
