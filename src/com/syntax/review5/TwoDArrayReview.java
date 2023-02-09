package review5;

public class TwoDArrayReview {
    public static void main(String[] args) {

        int[][] array={{1,2,3},{11,22,33},{20,21,22},{100,101}};

        System.out.println("***************************");

        int numberOfArrays= array.length;
        System.out.println(numberOfArrays);

        System.out.println("*******************************");

        int numberOfElementsInArray=array[0].length;
        System.out.println(numberOfElementsInArray);

        System.out.println("******************************");

        int numberOfElementsInArray1=array[3].length;
        System.out.println(numberOfElementsInArray1);

        System.out.println("*******************************");


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; array.length > j; j++) {

            }
        }

        System.out.println("**************** 5 *****************");

        for(int[]arr:array){
            for(int num:arr){

                System.out.print(num+" ");
            }
            System.out.println();
        }

        System.out.println("***********************************");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j<array[i].length; j++) {
                if(i%2!=0) {    // print just odd rows
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }

        System.out.println("**************************************");


    }
}
