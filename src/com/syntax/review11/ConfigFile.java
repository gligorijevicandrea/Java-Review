package com.syntax.review11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFile {
    public static void main(String[] args) {

        // location of the file , right click on file and Copy path,reference
        String path="Files/Config.properties";

        // navigating to the file
        // whenever we have to read the data from a file we use FileInputStream

        try {  // this or Add exception
            FileInputStream fileInputStream=new FileInputStream(path);
            Properties properties=new Properties();  // This "Properties" class will assist us to read and write data to .properties files
            properties.load(fileInputStream);

            System.out.println(properties.getProperty("userName"));

        } catch (FileNotFoundException e) {
           // throw new RuntimeException(e);
            System.out.println("Something gone wrong");
        }catch (NullPointerException e){
            System.out.println("You are trying to call a method on Null object");
        } catch (IOException e){
            System.out.println("IO Exception occurred");
        }

    }
}
