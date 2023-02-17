package com.syntax.review8;

public class InsuranceTest {
    public static void main(String[] args) {

        // can I create an object of Insurance class? - NO , because it's abstract
        // we can creating indirectly by creating an object of child class

        Insurance carPolicy=new CarPolicy("I6767","John Smith",200,22);

        carPolicy.getInsurance();
        System.out.println(carPolicy.calculateCoverage());

        // upcasting
        Insurance petPolicy=new PetPolicy("Pfsfs","Olena L",20,4);
        petPolicy.getInsurance();
        System.out.println(petPolicy.calculateCoverage());


        // storing NON primitive all together
        Insurance[]insurances={new CarPolicy("I6767","John Smith",200,22),
                new CarPolicy("I6767","John Smith",200,22),
                new PetPolicy("I6767","John Smith",200,22),
                new CarPolicy("I6767","John Smith",200,22)};

        insurances[0].calculateCoverage();



    }
}
