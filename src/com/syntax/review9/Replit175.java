package com.syntax.review9;




    class Replit175 implements FirstInterface, SecondInterface {

        @Override
        public void firstMethod(){
            System.out.println("First Method implementing multiple Inheritance");
        }

        @Override
        public void secondMethod(){
            System.out.println("Second Method implementing multiple Inheritance");
        }

        public void main(String[] args) {
            Replit175 main=new Replit175();
            main.firstMethod();
            main.secondMethod();

        }
    }

    interface FirstInterface {

        void firstMethod();

        void secondMethod();
    }

    interface SecondInterface {

        void secondMethod();


    }

