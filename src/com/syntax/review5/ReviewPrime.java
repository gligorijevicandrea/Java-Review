package review5;

public class ReviewPrime {
    public static void main(String[] args) {


        int given=9;
        boolean isPrime=true;

        if(given>1){
            for (int i = 2; i < given; i++) {
                if (given % 2 == 0) {
                    isPrime = false;
                    break;
                }
            }

        }else {
                isPrime = false;
        }
        System.out.println("Given number "+given+"is Prime? "+isPrime);






    }
}
