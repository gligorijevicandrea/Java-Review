package com.syntax.review8;

public class Furniture {

    public void assemble(){
        System.out.println("Furniture needs to be assembled");
    }

    public void comfort(){  // overriden
        System.out.println("Furniture needs to be comfortable");
    }


}

class Chair extends Furniture{

    public void comfort(){  // overriding
        System.out.println("Not every chair is comfortable");
    }

    protected  void loveSeat(){
        System.out.println("This is the best chair");
    }

}

class Table extends Furniture{

    public void comfort(){
        System.out.println("Table can not be comfy");
    }


    protected void buildTable(){ // overloaded method
        System.out.println("we can build a table");
    }

    void buildTable(String material){ // overloaded method
        System.out.println("we build table using "+material);
    }
}

// if we add material for String that method will be achieved,otherwise the first one