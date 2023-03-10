package com.syntax.review9;

// collection of public static final variables= CONSTANT and public abstract methods= ABSTRACT
public interface Drawable {

    // we can have methods and variables in Interface
    // no constructors in Interface , because no object
    // we can't just create instance variable like String tool;
     String TOOL="Pencil";  // this is CONSTANT variable = public static final by default
    void draw();  // by default this method is public and abstract , doesn't have method body

    // above is how Interface used to be before Java 8
    // after Java 8 static and default methods were added to the Interface

    default void print(){
        System.out.println("We are drawing object using "+TOOL);
    }
    static void erase(){
        System.out.println("All drawings are erasable");
    }

}

abstract class Shape {

    String color;
    double width,length;

    // creating constructor   ( constructor has the same name as a class name
    Shape(String color,double width, double length){
        this.color=color;
        this.width=width;
        this.length=length;

    }

    // creating method
   public abstract double calculateArea();  // abstract because there is no body of method

}
class Rectangle extends Shape implements Drawable{ // when we have 2 parents

    Rectangle(String color,double width, double length){  // adding constructor from parent class Shape () with new constructor name
        super(color,width,length);
    }
    @Override
    public double calculateArea() {
        return length*width;
    }

    public void draw(){
        System.out.println("I am drawing rectangle");
    }

}

class Square implements Drawable{
    @Override
    public void draw() {
        System.out.println("I am drawing Square");
    }
}


