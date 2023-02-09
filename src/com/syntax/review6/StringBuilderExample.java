package review6;

public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Hello");  // StringBuilder is mutable
        sb.reverse();

        System.out.println(sb);

        String str=sb.toString();
        str.toUpperCase();  //  String is immutable
        System.out.println(str);

    }
}
