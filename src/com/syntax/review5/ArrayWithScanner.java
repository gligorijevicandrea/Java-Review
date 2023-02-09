package review5;

import java.util.Scanner;

public class ArrayWithScanner {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("How many names you want to stare");
        int size= input.nextInt();
        String[]name=new String[size];

        for (int i = 0; i < name.length; i++) {
            System.out.println("Please enter the name");
            name[i]= input.next();
        }

        for(String n:name){
            System.out.println(n);
        }


    }
}
