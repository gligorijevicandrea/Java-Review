package com.syntax.review8;

public class Store {
    public static void main(String[] args) {

        // when we create an object of the class and assign it to parent class,but it prints child class first because we overrided it ,if not than parent class
        Furniture chair=new Chair(); // upcasting
        chair.assemble();
        chair.comfort(); // runtime polymorphism

        Furniture table=new Table(); // upcasting
        table.comfort(); // runtime polymorphism
        table.assemble();


        // regular accessing of child class methods
        Table t=new Table();
        t.buildTable("Wood"); // from child
        t.assemble(); // from parent
        t.comfort(); // from child

        // proof that method breaks is not overriden





    }
}
