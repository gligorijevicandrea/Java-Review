package com.syntax.review9;

public class Replit171 {


    class Main extends Parent{

        @Override
        public void m1(){
            System.out.println("m1 method without parameters");
        }
        @Override
        public void m1(String str){
            System.out.println("m1 method with parameter");
        }

        public void main(String[] args) {

            Main main = new Main();
            main.m1();
            main.m1("Hello");
        }
    }

    abstract class Parent{
        abstract void  m1();
        abstract void m1(String str);
    }
}
