package review6;

public class Flower {

    static boolean pretty = true; // static defines the variable for all objects

    // Attributes, properties

    String color, type, name;
    int price;

    // behavior

    void smell(){
        System.out.println(name+" Smells good");
    }
    void bloom(){
        System.out.println(name+" Flower blooms");
    }
    void grow(){
        System.out.println(name+" Flower grows");
    }


    void hello(){
        String name="Adam";  // local variable can never be static
        System.out.println("Hello "+name);
    }




    public static void main(String[] args) {

       // System.out.println(name); // can not access the local variable
    }


}
