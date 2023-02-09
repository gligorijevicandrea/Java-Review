package review5;

public class ReviewFibonachi {
    public static void main(String[] args) {


        int a=0;
        int b=1;
        int c=0;

        for (int i = 1; i < 10; i++) {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }


    }
}
