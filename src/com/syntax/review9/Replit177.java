package com.syntax.review9;

interface Outputs {
        void display(double result);
        }

interface functions {
    double adding(double firstNumber, double secondNumber);
    double subtracting(double firstNumber, double secondNumber);
    double multiply(double firstNumber, double secondNumber);
    double dividing(double firstNumber, double secondNumber);
}

class Main implements functions {
    public void display(double result) {
        System.out.println("Result is ::: "+result);
    }

    public double adding(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public double subtracting(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public double dividing(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public static void main(String[] args) {
        double firstNumber = 100.00;
        double secondNumber = 20.00;

        Main obj = new Main();

        double result = obj.adding(firstNumber, secondNumber);
        obj.display(result);

        result = obj.subtracting(firstNumber, secondNumber);
        obj.display(result);

        result = obj.multiply(firstNumber, secondNumber);
        obj.display(result);

        result = obj.dividing(firstNumber, secondNumber);
        obj.display(result);
    }
}
