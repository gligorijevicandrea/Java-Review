package com.syntax.review8;

public abstract class Insurance {

    // Can I have variables inside abstract class - YES

    public static String company="Geico";
    protected String policyNumber;
     String policyHolder; // this is instance variable , so we should have constructor

    private String ssn;

    // Can I have constructor inside abstract class - YES
    public Insurance(String policyHolder, String policyNumber){
        this.policyHolder=policyHolder;
        this.policyNumber=policyNumber;
    }
    public void getInsurance(){
        System.out.println("we need to get insurance");
    }

    public abstract double calculateCoverage();
}

class  CarPolicy extends Insurance{

    double premium;
    int age;

    CarPolicy(String policyNumber,String policyHolder,double premium,int age){
        super(policyNumber,policyHolder);
        this.premium=premium;
        this.age=age;
    }
    // to provide implementation we need to follow rules of overriding

        public double calculateCoverage(){
            if(age<20){
                return premium*2;
            } else if (age<40) {
                return premium*0.5;
            }else{
                return premium*0.2;
            }
        }

}

class PetPolicy extends Insurance{

    int numberOfPets;

    double premium;

    PetPolicy(String policyNumber,String policyHolder,double premium,int numberOfPets){
        super(policyNumber,policyHolder);
        this.premium=premium;
        this.numberOfPets=numberOfPets;
    }
    public double calculateCoverage(){ // providing an implementation

        if(numberOfPets>2){
            return premium*2;
        } else if (numberOfPets>5) {
            return premium*3;
        }else {
            return premium*5;
        }
    }


}