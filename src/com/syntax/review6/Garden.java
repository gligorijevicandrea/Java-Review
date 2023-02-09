package review6;

public class Garden {
    public static void main(String[] args) {

        Flower flower1= new Flower();
        flower1.name="Hibiscus";
        flower1.color="red";
        flower1.price=5;
        flower1.bloom();
        flower1.grow();
        flower1.smell();
        System.out.println(Flower.pretty); // correct way to access a variable
        System.out.println("is it pretty?"+flower1.pretty); // wrong way to access a variable

        System.out.println("********************************");

        Flower flower2= new Flower();
        flower2.name="Rose";
        flower2.color="blue";
        flower2.price=15;
        flower2.bloom();
        flower2.grow();
        flower2.smell();
        System.out.println("is it pretty?"+flower2.pretty);

        Flower flower3= new Flower();

    }
}
