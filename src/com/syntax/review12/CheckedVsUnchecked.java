package com.syntax.review12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedVsUnchecked {
    public static void main(String[] args) {

        // Exceptions can occur because of 2 main reasons:
        // 1)mistake of programmer
        // 2) because of the external resources on which our program is dependent

//  when exceptions occur because of human error or can be avoided by simple writing good code and may if ele conditions
//  they are called Unchecked exception


        System.out.println(10/0);

        try {
            FileInputStream fileInputStream = new FileInputStream("File/Book1.xlsx");
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
        // this is checked exception



    }
}
