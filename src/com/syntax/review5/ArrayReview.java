package review5;

public class ArrayReview {
    public static void main(String[] args) {

        int a =10;
        int[]arr={10,20,30};
        int[]arr1=new int[3];
        arr1[0]=10;
        arr1[1]=20;
        arr1[2]=30;
        System.out.println(arr1[2]);
        System.out.println("size of array"+arr1.length);

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        String[] colors={"Black","White","Red","Purple","Blue"};

        //enhanced forLoop
        for(String color:colors){
            System.out.print(color+" ");
        }

        for (int i = colors.length;i>=0;i--) {
            System.out.println(colors[i]+"; ");
        }

    }
}
